package com.example.hp.netcampproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ninth extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1,b2;
    TextView t1;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        t1 = (TextView)findViewById(R.id.textView3);
        b1 = (Button)findViewById(R.id.button18);
        b2 = (Button)findViewById(R.id.button19);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(ninth.this, fourth.class);
                startActivity(j);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if(r3.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }
                Intent i = new Intent(ninth.this,tenth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
