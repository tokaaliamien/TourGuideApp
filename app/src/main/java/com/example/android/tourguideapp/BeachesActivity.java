package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.beaches_stanli_beach_name), getString(R.string.beaches_stanli_beach_add)));

        PlaceAdaptor adaptor = new PlaceAdaptor(this, places);

        ListView listView = (ListView) findViewById(R.id.beaches_list);

        listView.setAdapter(adaptor);
    }
}
