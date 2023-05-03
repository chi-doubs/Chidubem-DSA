package com.chidubem.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args){
        int data[] = new int[10];
        Random rand = new Random();
        rand.setSeed((System.currentTimeMillis()));

        for(int i = 0; i< data.length; i++)
            data[i] = rand.nextInt(100);
        int[ ] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
         System.out.println("arrays equal before sort: "+Arrays.equals(data, orig));
         Arrays.sort(data); // sorting the data array (orig is unchanged)
         System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
         System.out.println("orig = " + Arrays.toString(orig));
         System.out.println("data = " + Arrays.toString(data));
    }


    // Class for doing encryption and decryption using the Caesar Cipher. ∗/
             public static class CaesarCipher {
        protected char[] encoder = new char[26]; // Encryption array
        protected char[] decoder = new char[26]; // Decryption array
        // Constructor that initializes the encryption and decryption arrays ∗/

        public CaesarCipher(int rotation){
            for ( int k =0; k<26; k++){
                encoder[k] = (char) ('A' + (k + rotation) % 26);
                decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
            }
        }

        // Returns String representing encrypted message. ∗/
        public String encrypt(String message){
            return transform(message, encoder);
        }

         // Returns decrypted message given encrypted secret. ∗/
         public String decrypt(String message){
             return transform(message, decoder);
         }

        private String transform(String original , char[] code) {
            char[] msg = original.toCharArray();
            for (int k = 0; k< msg.length; k++)
                if (Character.isUpperCase(msg[k])){
                    int j = msg[k] - 'A';
                    msg[k] = code[j];
                }
            return new String(msg);

        }

        // Simple main method for testing the Caesar cipher ∗/
                public static void main(String[ ] args) {
             CaesarCipher cipher = new CaesarCipher(3);
             System.out.println("Encryption code = " + new String(cipher.encoder));
             System.out.println("Decryption code = " + new String(cipher.decoder));
             String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
             String coded = cipher.encrypt(message);
             System.out.println("Secret: " + coded);
             String answer = cipher.decrypt(coded);
             System.out.println("Message: " + answer); // should be plaintext again
             }

    }
}
