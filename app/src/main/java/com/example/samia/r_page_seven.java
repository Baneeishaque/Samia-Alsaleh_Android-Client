package com.example.samia;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class r_page_seven extends AppCompatActivity {

    Context activityContext = this;

    RecyclerView recyclerView;

    List<String> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_page_seven);

        initialize();

    }

    private void initialize() {

        recyclerView =(RecyclerView) findViewById(R.id.recycerView7);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        categoryList.add("Hair Care");
        categoryList.add("BodyCare");
        categoryList.add("SkinList");

        recyclerView.setAdapter(new Page7Adapter(categoryList));

    }
}
