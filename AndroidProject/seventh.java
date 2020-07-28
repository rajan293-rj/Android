package com.example.hp.netcampproject;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;

public class seventh extends AppCompatActivity {
    Button b1,b2;
    ImageView i1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1 = (Button)findViewById(R.id.button31);   //back
        b2 = (Button)findViewById(R.id.button35);   //capture
        i1 = (ImageView)findViewById(R.id.imageView4);
        t1 = (TextView)findViewById(R.id.textView10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(seventh.this, third.class);
                startActivity(j);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bm = (Bitmap)data.getExtras().get("data");
        i1.setImageBitmap(bm);
    }

}
