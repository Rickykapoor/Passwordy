package com.example.android.passwordy;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;
import java.util.Scanner;

public class simple_one {
    public String simple1password(int lenght) {

        String uppercase = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqstuvwxyz";
        String numbers = "1234567890";
        String special = "@!#";
        int input = lenght;
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

