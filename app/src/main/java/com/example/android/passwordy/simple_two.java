package com.example.android.passwordy;
import java.util.Random;
public class simple_two {
    public String simple2password(int length) {
        String pass;
        String uppercase = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqstuvwxyz";
        String numbers = "1234567890";
        int input = length;
            String combined = uppercase + lowercase + numbers;
            int len = input;
            char[] password = new char[len];
            Random ran = new Random();
            for (int i = 0; i < len; i++) {
                password[i] = combined.charAt(ran.nextInt(combined.length()));
            }
        pass = new String(password);
        return  pass;
    }
}
