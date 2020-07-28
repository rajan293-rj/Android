package com.example.hp.netcampproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fourteenth extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth);
        b1 = (Button)findViewById(R.id.button26);
        b2 = (Button)findViewById(R.id.button27);
        b3 = (Button)findViewById(R.id.button28);
        b4 = (Button)findViewById(R.id.button29);
        t1 = (TextView)findViewById(R.id.textView8);

        Integer i = ninth.score;
        String ss = Integer.toString(i);
        t1.setText(ss);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
                startActivity(a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.netcamp.in"));
                startActivity(a);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(fourteenth.this,third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
