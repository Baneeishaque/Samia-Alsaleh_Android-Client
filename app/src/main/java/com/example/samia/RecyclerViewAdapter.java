package com.example.samia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Integer> imageList = new ArrayList<>();
    List<String> titleList = new ArrayList<>();
    List<String> priceList = new ArrayList<>();

    public RecyclerViewAdapter(List<Integer> imageList, List<String> titleList, List<String> priceList) {
        this.imageList = imageList;
        this.titleList = titleList;
        this.priceList = priceList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageViewItem.setImageResource(imageList.get(position));
        holder.textViewItemName.setText(titleList.get(position));
        holder.textViewItemPrice.setText(priceList.get(position));

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewItem;
        TextView textViewItemName;
        TextView  textViewItemPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewItem = (ImageView)itemView.findViewById(R.id.imageViewItem);
            textViewItemName = (TextView)itemView.findViewById(R.id.textViewItemName);
            textViewItemPrice = (TextView)itemView.findViewById(R.id.textViewItemPrice);

        }
    }

}
