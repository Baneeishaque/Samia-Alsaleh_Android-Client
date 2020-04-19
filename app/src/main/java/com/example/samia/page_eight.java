package com.example.samia;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ndk.utils_android1.ActivityUtils;

public class page_eight extends AppCompatActivity {

    Context activityContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_eight);

        Button buttonHairCare = findViewById(R.id.buttonShampoo);
        buttonHairCare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_eleven.class);
            }
        });
    }
}
