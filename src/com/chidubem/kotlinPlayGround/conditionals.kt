package com.chidubem.kotlinPlayGround

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


// use classes and objects in Kotlin
 open class SmartDevice protected constructor ( val name: String, val category: String){

       open val deviceType = "unknown"

       var deviceStatus = "online"
       protected set(value) {
           field = value
       }
      open fun turnOn(){
           deviceStatus = "on"
       }

      open fun turnOff(){
           deviceStatus = "off"
       }

       constructor(name: String, category: String, statusCode: Int) : this(name,category) {
           deviceStatus = when (statusCode){
               0 -> "offline"
               1 -> "online"
               else -> "unknown"
           }
       }
    }


class SmartTvDevice(deviceName: String, deviceCategory: String) :
        SmartDevice(name = deviceName, category = deviceCategory){

    private var speakerVolume by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
    override val deviceType = "Smart TV"

//      protected var speakerVolume = 2
//    set(value){
//        if (value in 0..100){
//            field = value
//        }
//    }

//   private var channelNumber = 1
//        set(value) {
//            if (value in 0..200) {
//                field = value
//            }
//        }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }
     fun nextChannel(){
        channelNumber++
    }

    fun previousChannel(){
        channelNumber--
    }
        }



class SmartLightDevice(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category =  deviceCategory){

    private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    override val deviceType = "Smart Light"

        //   private var brightnessLevel = 0

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun increaseBrightness(){
                        brightnessLevel++
                    }



}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
    ) {

    var deviceTurnOnCount = 0
    private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrevious(){
        smartTvDevice.previousChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffLight()
        turnOffTv()
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue){
            fieldData = value
        }
    }

}


fun main() {
    val smartHome = SmartHome(
        SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment"),
        SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
    )

    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    println()

    smartHome.turnOffAllDevices()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
}
