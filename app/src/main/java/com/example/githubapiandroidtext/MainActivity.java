package com.example.githubapiandroidtext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initData() {
        getAPI();
    }

    private void getAPI() {
        ListApi listApi = new ListApi();
    }

    private void initView() {
        rvMainListView = findViewById(R.id.rvMainListView);
    }
}