package com.example.virusapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    GridLayout maingrid;
    CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initial and assien variable
        maingrid = findViewById(R.id.mainGridId);
        card1 = findViewById(R.id.card1Id);
        card2 = findViewById(R.id.card2Id);
        card3 = findViewById(R.id.card3Id);
        card4 = findViewById(R.id.card4Id);
        card5 = findViewById(R.id.card5Id);
        card6 = findViewById(R.id.card6Id);

//        BOTTOM NAVIGATION BAR


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomnavigationId);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.icon1:
                        break;
                    case R.id.icon2:
                        Intent a = new Intent(MainActivity.this, Icon2Activity.class);
                        startActivity(a);
                        break;
                    case R.id.icon3:
                        Intent b = new Intent(MainActivity.this, Icon3Activity.class);
                        startActivity(b);
                        break;
                    case R.id.icon4:
                        Intent c = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(c);
                        break;

                }
                return false;
            }
        });


//        card 1 click
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,KoronaVirusActivity.class);
                startActivity(intent);
            }
        });

  card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Icon1Activity.class);
                startActivity(intent);
            }
        });
  card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Icon1Activity.class);
                startActivity(intent);
            }
        });
  card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Icon1Activity.class);
                startActivity(intent);
            }
        });
  card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Icon1Activity.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Icon1Activity.class);
                startActivity(intent);
            }
        });


    }


}
