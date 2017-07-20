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
        places.add(new Place("Four Seasons Hotel", " 399 El Geish Road San Stefano", "1-866-599-6674", 4.8f));
        places.add(new Place("Romance Alexandria Corniche", "303 Tareek El Gueish Saba Pasha", "1-866-599-6674", 3.6f));

        PlaceAdaptor adaptor = new PlaceAdaptor(this, places);

        ListView listView = (ListView) findViewById(R.id.hotels_list);

        listView.setAdapter(adaptor);

    }
}
