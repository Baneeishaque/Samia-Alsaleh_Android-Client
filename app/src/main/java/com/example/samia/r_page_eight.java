package com.example.samia;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class r_page_eight extends AppCompatActivity {

    Context activityContext = this;

    RecyclerView recyclerView;

    List<String> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_page_eight);

        initialize();

    }

    private void initialize() {

        recyclerView =(RecyclerView) findViewById(R.id.recycerView8);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        categoryList.add("Shampoo");
        categoryList.add("xxxx");
        categoryList.add("xxyy");

        recyclerView.setAdapter(new Page7Adapter(categoryList));

    }
}
