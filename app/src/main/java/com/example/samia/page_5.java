package com.example.samia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class page_5 extends AppCompatActivity {

    private Page5Adapter page5Adapter;
    private LinearLayout linearLayoutPageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);

        linearLayoutPageIndicator = findViewById(R.id.linearLayoutPageIndicator);

        setupPageIndicator();

        setupPage5Items();

        ViewPager2 page5ViewPager = findViewById(R.id.viewPager_5);
        page5ViewPager.setAdapter(page5Adapter);

    }

    private  void  setupPage5Items(){

        List<Page5Item> page5Items = new ArrayList<>();

        Page5Item itemPage5 = new Page5Item();
        itemPage5.setTitle("WELCOME TO SALON X");
        itemPage5.setDescription("Find the best shampoo and creams from the thousands.");
        itemPage5.setImage(R.drawable.ic_launcher_foreground);

        Page5Item itemPage6 = new Page5Item();
        itemPage6.setTitle("ADD TO CART");
        itemPage6.setDescription("Choose the product of your choice and put it into the shopping cart.");
        itemPage6.setImage(R.drawable.ic_launcher_foreground);

        Page5Item itemPage7 = new Page5Item();
        itemPage7.setImage(R.drawable.ic_launcher_foreground);
        itemPage7.setTitle("CONFIRM ORDER");
        itemPage7.setDescription("Enter billing and shipping information to place your order and you'll confirmed.");

        page5Items.add(itemPage5);
        page5Items.add(itemPage6);
        page5Items.add(itemPage7);

        page5Adapter = new Page5Adapter(page5Items);

    }

    private  void  setupPageIndicator(){

        ImageView[] indicator = new ImageView[page5Adapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(8,0,8,0);
        for (int i = 0; i< indicator.length; i++){
            indicator[i] = new ImageView(getApplicationContext());
            indicator[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.page_inactive_indicator));
            indicator[i].setLayoutParams(layoutParams);
            linearLayoutPageIndicator.addView(indicator[i]);
        }

    }

}
