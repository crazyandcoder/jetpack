package com.crazyandcoder.top.jetpackdemojava.jetpack.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.crazyandcoder.top.jetpackdemojava.R;
import com.crazyandcoder.top.jetpackdemojava.bean.Book;
import com.crazyandcoder.top.jetpackdemojava.databinding.ActivityDemoDataBindingBinding;

public class DemoDataBindingActivity extends AppCompatActivity {

    private boolean update = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityDemoDataBindingBinding activityDemoDataBindingBinding
                = DataBindingUtil.setContentView(this,
                R.layout.activity_demo_data_binding);
        final Book book = new Book("Jetpack", "crazyandcoder");
        book.setRating(5);
        activityDemoDataBindingBinding.setBook(book);

        activityDemoDataBindingBinding.setEventHandle(new EventHandleListener(this, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (update) {
                    book.setRating(1);
                    book.setAuthor("李大爷");
                    book.setTitle("Android开发");
                } else {
                    book.setRating(3);
                    book.setAuthor("感觉啊困死了的感觉卡洛斯的");
                    book.setTitle("噶厦的公交卡了甘尽苦来的世界观卡李吉感动");
                }
                update = !update;
                activityDemoDataBindingBinding.setBook(book);
            }
        }));

    }
}