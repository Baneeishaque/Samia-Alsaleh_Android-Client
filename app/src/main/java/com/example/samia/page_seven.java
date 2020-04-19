package com.example.samia;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ndk.utils_android1.ActivityUtils;

public class page_seven extends AppCompatActivity {

    Context activityContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_seven);

        Button buttonHairCare = findViewById(R.id.buttonHairCare);
        buttonHairCare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_eight.class);
            }
        });
    }
}
