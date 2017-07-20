package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_places);

        ArrayList<Place> places=new ArrayList<>();
        places.add(new Place(getString(R.string.places_bibliotheca_alexandrina_name), getString(R.string.places_bibliotheca_alexandrina_add), R.drawable.places_bibliotheca_alexandrina));
        places.add(new Place(getString(R.string.places_citadel_of_qaitbay_name), getString(R.string.places_citadel_of_qaitbay_add), R.drawable.places_citadel_qaitbay));


        PlaceAdaptor adaptor =new PlaceAdaptor(HistoricalPlacesActivity.this,places);

        ListView listView=(ListView)findViewById(R.id.historical_places_list);

        listView.setAdapter(adaptor);



    }
}
