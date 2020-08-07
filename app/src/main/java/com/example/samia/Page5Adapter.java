package com.example.samia;

import android.graphics.pdf.PdfDocument;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Page5Adapter extends  RecyclerView.Adapter<Page5Adapter.PageViewHolder> {

    private List<Page5Item> page5Items;

    public Page5Adapter(List<Page5Item> page5Items) {
        this.page5Items = page5Items;
    }

    @NonNull
    @Override
    public PageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page_5,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PageViewHolder holder, int position) {
        holder.setPageData(page5Items.get(position));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PageViewHolder extends RecyclerView.ViewHolder{

        private TextView textTitle;
        private TextView textDescription;
        private ImageView imageView;

        public PageViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.textView_page5_title);
            textDescription = itemView.findViewById(R.id.textView_page5_description);
            imageView = itemView.findViewById(R.id.imageView_page_5);

        }

        void setPageData(Page5Item page5Item ){

            textTitle.setText(page5Item.getTitle());
            textDescription.setText(page5Item.getDescription());
            imageView.setImageResource(page5Item.getImage());

        }


    }

}
