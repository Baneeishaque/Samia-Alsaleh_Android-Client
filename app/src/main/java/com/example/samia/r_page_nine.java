package com.example.samia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class r_page_nine extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Integer> imageList = new ArrayList<>();
    List<String> titleList = new ArrayList<>();
    List<String> priceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_page_nine);

        intialize();

    }

    private void intialize() {

        recyclerView = (RecyclerView)findViewById(R.id.recycerView9);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        imageList.add(R.mipmap.ic_launcher);
        imageList.add(R.mipmap.ic_launcher);
        imageList.add(R.mipmap.ic_launcher);
        imageList.add(R.mipmap.ic_launcher);

        titleList.add("abc");
        titleList.add("def");
        titleList.add("ghi");
        titleList.add("jkl");

        priceList.add("100");
        priceList.add("120");
        priceList.add("140");
        priceList.add("150");

        recyclerView.setAdapter(new RecyclerViewAdapter(imageList,titleList,priceList));

    }

}
