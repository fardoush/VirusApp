package com.example.virusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.virusapp.Adapter.KoronaAdapter;
import com.example.virusapp.Model.Model;

import java.util.ArrayList;
import java.util.List;

//public class KoronaVirusActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_korona_virus);
//    }
//}



public class KoronaVirusActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KoronaAdapter adapter;
    List<Model> loadlist;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korona_virus);



        recyclerView = findViewById(R.id.korona_recyclerId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadlist=new ArrayList<>();
        loadlist.add(new Model(R.drawable.pic1,"করোনা ভাইরাস ইতিহাস"));
        loadlist.add(new Model(R.drawable.pic2,"করোনা ভাইরাস কি"));
        loadlist.add(new Model(R.drawable.pic3,"করোনা ভাইরাস যেভাবে ছড়ায়"));
        loadlist.add(new Model(R.drawable.pic4,"করোনা ভাইরাসের লক্ষণ"));
        loadlist.add(new Model(R.drawable.pic5,"করোনা ভাইরাস প্রতিরোধ যা করবেন"));
        loadlist.add(new Model(R.drawable.pic3,"করোনা ভাইরাস আক্রান্ত হলে কি  করণীয়"));


        adapter= new KoronaAdapter(this,loadlist);
        recyclerView.setAdapter(adapter);

    }




}