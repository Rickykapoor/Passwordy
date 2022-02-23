package com.example.android.passwordy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Complex extends AppCompatActivity {
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex);



        TextView passwordDisplay = (TextView) findViewById(R.id.textView6);

        Button gen = (Button) findViewById(R.id.button);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText lengt = (EditText) findViewById(R.id.editTextNumber);
                if (!TextUtils.isEmpty(lengt.getText().toString())) {
                    String len = lengt.getText().toString();
                    int length = Integer.parseInt(len);


                    TextView ypi = (TextView) findViewById(R.id.textView7);
                    ypi.setText("Your Password is\uD83D\uDC47");

                    if (length < 7 || length > 129) {

                        Context context = getApplicationContext();
                        CharSequence text = "Please enter length between 8 to 128 in order to meet securty standards";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                    } else {
                        complex_method C = new complex_method();
                        password = C.complexpassword(length);
                        passwordDisplay.setText(password);
                        String pass = passwordDisplay.getText().toString();
                        pass = password;
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Length is empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button copyToClip = (Button) findViewById(R.id.button2);
        copyToClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                android.content.ClipData clip = android.content.ClipData.newPlainText("copied",password);
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                CharSequence text = "Copied!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        FloatingActionButton homeButton = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(Complex.this,MainActivity.class);
                startActivity(mainActivity);
            }
        });
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/arcanenine.otf");
        TextView description = (TextView) findViewById(R.id.textView5);
        description.setTypeface(tf);
    }
}