package com.crazyandcoder.top.jetpackdemojava.jetpack.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.crazyandcoder.top.jetpackdemojava.R;

public class DemoViewModelActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_view_model);
        textView = findViewById(R.id.textView);


        TimerViewModel viewModel = new ViewModelProvider(this).get(TimerViewModel.class);
        MutableLiveData<Integer> liveData= (MutableLiveData<Integer>) viewModel.getCurrentSecond();
        liveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(""+integer);
            }
        });


        viewModel.startTiming();
    }

}