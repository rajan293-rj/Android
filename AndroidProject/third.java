package com.example.hp.netcampproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        i1 = (ImageView)findViewById(R.id.imageView);
        b1 = (Button)findViewById(R.id.button5);
        b2 = (Button)findViewById(R.id.button6);  //mediaplayer
        b3 = (Button)findViewById(R.id.button7);    //calculator
        b4 = (Button)findViewById(R.id.button8);    //camera
        b5 = (Button)findViewById(R.id.button9);    //special function

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this, MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this, fifth.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this, sixth.class);
                startActivity(j);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this, seventh.class);
                startActivity(j);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(third.this, fourth.class);
                startActivity(j);
                finish();
            }
        });
    }
}
