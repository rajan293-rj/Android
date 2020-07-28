package com.example.hp.netcampproject;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class eightth extends AppCompatActivity implements SensorEventListener{
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;
    Button b1;
    ImageView i1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightth);
        b1 = (Button)findViewById(R.id.button32);
        i1 = (ImageView)findViewById(R.id.imageView5);
        t1 = (TextView)findViewById(R.id.textView11);
        mp = MediaPlayer.create(this, R.raw.s);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(eightth.this, s, SensorManager.SENSOR_DELAY_NORMAL);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying())      //----------------------------------------------------------------------
                {
                    mp.stop();
                }
                Intent j = new Intent(eightth.this, fourth.class);
                startActivity(j);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.values[0]>5)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
