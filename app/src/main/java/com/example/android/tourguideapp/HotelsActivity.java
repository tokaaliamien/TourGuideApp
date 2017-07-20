package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.hotels_four_seasons_hotel_name), getString(R.string.hotels_four_seasons_hotel_add), getString(R.string.hotels_four_seasons_hotel_phone), 4.8f));
        places.add(new Place(getString(R.string.hotels_romance_alexandria_corniche_name), getString(R.string.hotels_romance_alexandria_corniche_add), getString(R.string.hotels_romance_alexandria_corniche_phone), 3.6f));

        PlaceAdaptor adaptor = new PlaceAdaptor(this, places);

        ListView listView = (ListView) findViewById(R.id.hotels_list);

        listView.setAdapter(adaptor);

    }
}
