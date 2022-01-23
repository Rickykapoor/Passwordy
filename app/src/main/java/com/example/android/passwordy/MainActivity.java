package com.example.android.passwordy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button complex = (Button) findViewById(R.id.button6);
        complex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complexIntent = new Intent(MainActivity.this, Complex.class);
                startActivity(complexIntent);
            }
        });

        Button simple1= (Button) findViewById(R.id.button5);
        simple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent simple1Intent = new Intent(MainActivity.this, Simple1.class);
                startActivity(simple1Intent);
            }
        });
        Button simple2 =(Button) findViewById(R.id.button4);
        simple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simple2Intent= new Intent(MainActivity.this,Simple2.class);
                startActivity(simple2Intent);
            }
        });


        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/arcanenine.otf");
        TextView s1Description = (TextView) findViewById(R.id.textView2);
        TextView s2Description = (TextView) findViewById(R.id.textView3);
        TextView ComplexDescription = (TextView) findViewById(R.id.textView);

        s1Description.setTypeface(tf);
        s2Description.setTypeface(tf);
        ComplexDescription.setTypeface(tf);
        complex.setTypeface(tf);
        simple1.setTypeface(tf);
        simple2.setTypeface(tf);
        FloatingActionButton infoButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);



        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(MainActivity.this,about_Page.class);
                startActivity(info);
            }
        });



    }
}