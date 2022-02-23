package com.example.android.passwordy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class about_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        FloatingActionButton homeButton = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(about_Page.this,MainActivity.class);
                startActivity(mainActivity);
            }
        });
        setupHyperlink();
    }
    public void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.textView4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}