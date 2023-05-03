package com.chidubem.thoughts;

import java.awt.*;


public class Notes {
    String date;
    String message;
    Image picture;
    boolean secret;

    public Notes(String theDate, String theMessage, boolean isSecret){
        date = theDate;
        message = theMessage;
        secret = isSecret;
    }

    public static void main(String[] args){
        Notes talk = new Notes("20th of June", "Samuel has started his role at Goldmans Sachs", true);
        System.out.println("My bro " + talk.message + " on the " + talk.date);
    }
}
