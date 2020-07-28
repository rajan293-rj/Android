package com.example.hp.netcampproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class thirteenth extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);
        r1 = (RadioButton)findViewById(R.id.radioButton17);
        r2 = (RadioButton)findViewById(R.id.radioButton18);
        r3 = (RadioButton)findViewById(R.id.radioButton19);
        r4 = (RadioButton)findViewById(R.id.radioButton20);
        t1 = (TextView)findViewById(R.id.textView7);
        b1 = (Button)findViewById(R.id.button25);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                {
                    ++ninth.score;
                }
                else
                {
                    --ninth.score;
                }
                Intent i = new Intent(thirteenth.this,fourteenth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
