package com.example.hp.netcampproject;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class sixth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText e1,e2;
    TextView t1,t2;
    TextToSpeech t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        b1=(Button)findViewById(R.id.button11);    //back
        b2=(Button)findViewById(R.id.button12);     //add
        b3=(Button)findViewById(R.id.button13);     //multiply
        b4=(Button)findViewById(R.id.button14);     //result
        b5=(Button)findViewById(R.id.button15);     //subtraction
        b6=(Button)findViewById(R.id.button16);     //divide
        b7=(Button)findViewById(R.id.button17);     //reset

        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);

        t1 = (TextView)findViewById(R.id.textView);
        t2 = (TextView)findViewById(R.id.textView2);

        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t.setLanguage(Locale.ENGLISH);
                t.setSpeechRate(0.9f);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(sixth.this, third.class);
                startActivity(j);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 + f2;
                String s3 = Float.toString(f3);
                t2.setText(s3);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 * f2;
                String s3 = Float.toString(f3);
                t2.setText(s3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = t2.getText().toString();
                t.speak("Result is "+str, TextToSpeech.QUEUE_FLUSH, null);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 - f2;
                String s3 = Float.toString(f3);
                t2.setText(s3);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 / f2;
                String s3 = Float.toString(f3);
                t2.setText(s3);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");//-----------------------------------------------------
                e2.setText("");
                t1.setText("");

            }
        });


    }
}
