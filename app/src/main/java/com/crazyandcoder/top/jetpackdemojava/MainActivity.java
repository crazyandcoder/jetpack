package com.crazyandcoder.top.jetpackdemojava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.crazyandcoder.top.jetpackdemojava.adapter.JetpackAdapter;
import com.crazyandcoder.top.jetpackdemojava.bean.JetpackItemBean;
import com.crazyandcoder.top.jetpackdemojava.utils.DataSourceUtils;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private HashMap<Integer, Class> clsList = DataSourceUtils.getClsList();
    private List<JetpackItemBean> jetpackItemBeanList = DataSourceUtils.getJetpackItems();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);


        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        JetpackAdapter jetpackAdapter = new JetpackAdapter(jetpackItemBeanList);
        recyclerView.setAdapter(jetpackAdapter);
        jetpackAdapter.setOnItemClickListener(new JetpackAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position, JetpackItemBean item) {
                if (clsList.get(item.getType()) != null) {
                    startActivity(new Intent(MainActivity.this, clsList.get(item.getType())));
                }
            }
        });

    }
}