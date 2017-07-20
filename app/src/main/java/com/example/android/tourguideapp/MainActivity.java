package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout hisotricalLayout=(RelativeLayout)findViewById(R.id.historical_places_layout);
        hisotricalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HistoricalPlacesActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout restaurantsLayout=(RelativeLayout)findViewById(R.id.restaurants_layout);
        restaurantsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout hotelsLayout=(RelativeLayout)findViewById(R.id.hotels_layout);
        hotelsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HotelsActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout beachesLayout=(RelativeLayout)findViewById(R.id.beaches_layout);
        beachesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BeachesActivity.class);
                startActivity(intent);
            }
        });


    }
}
