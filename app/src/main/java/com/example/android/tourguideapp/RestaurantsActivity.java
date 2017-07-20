package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ArrayList<Place> places=new ArrayList<>();
        places.add(new Place(getString(R.string.restaurants_mohammed_ahmed_name), getString(R.string.restaurants_mohammed_ahmed_add), "03-483 3576"));
        places.add(new Place(getString(R.string.restaurants_kadoura_name), getString(R.string.restaurants_kadoura_add), "03-480 0405"));
        places.add(new Place(getString(R.string.restaurants_gad_name), getString(R.string.restaurants_gad_add), "03-483 3576"));
        places.add(new Place(getString(R.string.restaurants_taverna_name), getString(R.string.restaurants_gad_add), "03-487 8591"));


        PlaceAdaptor adaptor =new PlaceAdaptor(this,places);

        ListView listView=(ListView)findViewById(R.id.restaurants_layout);

        listView.setAdapter(adaptor);

    }
}
