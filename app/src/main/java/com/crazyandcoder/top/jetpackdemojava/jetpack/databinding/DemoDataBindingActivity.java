package com.crazyandcoder.top.jetpackdemojava.jetpack.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.crazyandcoder.top.jetpackdemojava.R;
import com.crazyandcoder.top.jetpackdemojava.bean.Book;
import com.crazyandcoder.top.jetpackdemojava.databinding.ActivityDemoDataBindingBinding;

public class DemoDataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDemoDataBindingBinding activityDemoDataBindingBinding
                = DataBindingUtil.setContentView(this,
                R.layout.activity_demo_data_binding);
        Book book = new Book("Jetpack", "crazyandcoder");
        book.setRating(5);
        activityDemoDataBindingBinding.setBook(book);

    }
}