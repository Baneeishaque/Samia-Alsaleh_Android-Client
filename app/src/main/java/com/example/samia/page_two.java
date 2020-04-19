package com.example.samia;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ndk.utils_android1.ActivityUtils;

public class page_two extends AppCompatActivity {

    Context activityContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        Button buttonSignIn = findViewById(R.id.buttonSignin);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_six.class);
            }
        });

        TextView textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_three.class);
            }
        });

        ImageButton imageButtonFb = findViewById(R.id.imageButtonFb);
        imageButtonFb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_four.class);
            }
        });

        ImageButton imageButtonInsta = findViewById(R.id.imageButtonInsta);
        imageButtonInsta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityUtils.startActivity(activityContext, page_five.class);
            }
        });
    }
}
