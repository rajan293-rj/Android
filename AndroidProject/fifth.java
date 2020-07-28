package com.example.hp.netcampproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fifth extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1;
    ImageView i1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1 = (Button)findViewById(R.id.button30);  //back
        b2 = (Button)findViewById(R.id.button33);   //play
        b3 = (Button)findViewById(R.id.button34);   //pause
        t1 = (TextView) findViewById(R.id.textView);
        i1 = (ImageView)findViewById(R.id.imageView);

        mp = MediaPlayer.create(this,R.raw.s);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying())      //----------------------------------------------------------------------
                {
                    mp.stop();
                }
                Intent j = new Intent(fifth.this, third.class);
                startActivity(j);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

    }
}
