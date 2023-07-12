package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    ArrayList<content> list = new ArrayList<>();

        contentAdapter adapter;
        contentAdapter2 adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rrecyclerView);
        recyclerView2 = findViewById(R.id.rrecyclerView2);

        list.add(new content(R.drawable.img_1,"Apple"));
        list.add(new content(R.drawable.img_2,"CHplay"));
        list.add(new content(R.drawable.img_3,"Blogger"));
        list.add(new content(R.drawable.img_4,"chorme"));

        adapter =new contentAdapter(MainActivity.this,list);
        recyclerView.setAdapter(adapter);

        adapter2 = new contentAdapter2(MainActivity.this,list);
        recyclerView2.setAdapter(adapter2);
    }
}