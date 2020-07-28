package com.example.hp.netcampproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Second.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "FILL ALL", Toast.LENGTH_SHORT).show();
                }
                else
                {   //prayag is our databse and raj is table name
                    SQLiteDatabase data = openOrCreateDatabase("prayag",MODE_PRIVATE,null);
                    String s6 = "select * from raj where username='"+s1+"' and password='"+s2+"'";
                    Cursor cursor = data.rawQuery(s6,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this, "User Exists", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(MainActivity.this, third.class);
                        startActivity(j);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
