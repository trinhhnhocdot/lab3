package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contentAdapter extends RecyclerView.Adapter<contentAdapter.myViewHolder> {


    Context context;
    ArrayList<content> list;
    content content;

    public contentAdapter(Context context, ArrayList<content> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_content,parent,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        //set dữ liệu cho cá item ở trong layout item

        // bắt sự kiện các nút ở đây
        holder.image.setImageResource(list.get(position).getImage());
        holder.txtName.setText(list.get(position).getName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, list.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        if (list != null)
            return  list.size();
        return 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView txtName;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.id_image);
            txtName = itemView.findViewById(R.id.txtname);
        }
    }
}
