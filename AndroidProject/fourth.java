package com.example.hp.netcampproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class fourth extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1 = (Button)findViewById(R.id.button10);   //back
        b2 = (Button)findViewById(R.id.button23);   //quiz
        b3 = (Button)findViewById(R.id.button24);   //magical music player
        i1 = (ImageView)findViewById(R.id.imageView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(fourth.this, third.class);
                startActivity(j);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(fourth.this, ninth.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(fourth.this, eightth.class);
                startActivity(j);
                finish();
            }
        });
    }
}
