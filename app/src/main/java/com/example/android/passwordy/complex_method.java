package com.example.android.passwordy;

import java.util.Random;

public class complex_method {
    public String complexpassword(int length) {
        String uppercase = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqstuvwxyz";
        String numbers = "1234567890";
        String special = "!@#$%^&*()_+~`=+";
        System.out.println("Enter Password Length ");
        int input = length;
        String combined = uppercase + lowercase + special + numbers;
        int len = input;
        char[] password = new char[len];
        Random ran = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = combined.charAt(ran.nextInt(combined.length()));
        }
        String pass = new String(password);
        return pass;
    }
}
