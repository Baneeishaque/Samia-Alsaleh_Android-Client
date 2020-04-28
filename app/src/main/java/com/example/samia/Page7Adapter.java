package com.example.samia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ndk.utils_android1.ActivityUtils;

public class Page7Adapter extends RecyclerView.Adapter<Page7Adapter.MyHolder> {

    List<String> categoryList = new ArrayList<>();

    public Page7Adapter (List<String> categoryList){

        this.categoryList = categoryList;

    }

    @NonNull
    @Override
    public Page7Adapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_seven_button,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Page7Adapter.MyHolder holder, int position) {

        holder.buttonCare.setText(categoryList.get(position));

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private Button buttonCare;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ActivityUtils.startActivity(v.getContext(),page_eight.class);
                }
            });

            buttonCare = (Button) itemView.findViewById(R.id.buttonCare);

        }
    }
}
