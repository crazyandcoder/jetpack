package com.crazyandcoder.top.jetpackdemojava.jetpack.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crazyandcoder.top.jetpackdemojava.R;

public class LifeCycleActivity extends AppCompatActivity {

    private MyLocationListener locationListener;
    private Button start;
    private Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, LifecycleServiceTest.class);
                startService(intent);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, LifecycleServiceTest.class);
                stopService(intent);
            }
        });

        locationListener = new MyLocationListener(this, new MyLocationListener.OnLocationChangeListener() {
            @Override
            public void onChange(double lat, double lng) {

            }
        });

        getLifecycle().addObserver(locationListener);
    }
}