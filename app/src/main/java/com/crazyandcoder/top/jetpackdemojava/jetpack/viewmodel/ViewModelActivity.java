package com.crazyandcoder.top.jetpackdemojava.jetpack.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.crazyandcoder.top.jetpackdemojava.R;

public class ViewModelActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        textView = findViewById(R.id.textView);


        TimerViewModel viewModel = new ViewModelProvider(this).get(TimerViewModel.class);
        viewModel.setOnTimeChangeListener(new TimerViewModel.OnTimeChangeListener() {
            @Override
            public void onTimeChange(final int second) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("" + second);
                    }
                });
            }
        });
        viewModel.startTiming();
    }

}