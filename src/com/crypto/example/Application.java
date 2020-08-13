package com.crypto.example;

public class Application {

    public static void main(String[] args) {
        
        final String secretKey = "iamasecretkey";
        
        String originalString = "plesaeencryptme";
        String encryptedString = AES.encrypt(originalString, secretKey);
        String descryptedString = AES.decrypt(encryptedString, secretKey);
        
        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(descryptedString);
    }
}

