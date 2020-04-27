package com.example.samia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ndk.utils_android1.ActivityUtils;

public class page_ten extends AppCompatActivity {

    private ViewPager2 viewPager2;

    Context activityContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_ten);

        viewPager2 = findViewById(R.id.viewPager);

        List<ItemImage> itemImages = new ArrayList<>();
        itemImages.add(new ItemImage(R.mipmap.ic_launcher));
        itemImages.add(new ItemImage(R.mipmap.ic_launcher));
        itemImages.add(new ItemImage(R.mipmap.ic_launcher));
        itemImages.add(new ItemImage(R.mipmap.ic_launcher));

        viewPager2.setAdapter(new SliderAdapter(itemImages,viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        Button buttonBuy = findViewById(R.id.buttonBuy);

        buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext,page_eleven.class);
            }
        });

    }
}
