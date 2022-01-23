package com.example.android.passwordy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        // start thread
        background.start();
    }
    Thread background = new Thread() {
        public void run() {
            try {
                // Thread will sleep for 5 seconds
                sleep(2*1000);

                // After 5 seconds redirect to another intent
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);

                //Remove activity
                finish();
            } catch (Exception e) {
            }
        }
    };
}