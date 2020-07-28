package com.example.hp.netcampproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class eleventh extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        r1 = (RadioButton)findViewById(R.id.radioButton9);
        r2 = (RadioButton)findViewById(R.id.radioButton10);
        r3 = (RadioButton)findViewById(R.id.radioButton11);
        r4 = (RadioButton)findViewById(R.id.radioButton12);
        t1 = (TextView)findViewById(R.id.textView5);
        b1 = (Button)findViewById(R.id.button21);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                {
                    ++ninth.score;
                }
                else
                {
                    --ninth.score;
                }
                Intent i = new Intent(eleventh.this,twelth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
