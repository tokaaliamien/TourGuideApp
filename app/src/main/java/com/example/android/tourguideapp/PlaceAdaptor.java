package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Demo on 2017-07-20.
 */

public class PlaceAdaptor extends ArrayAdapter {
    public PlaceAdaptor(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Place currentPlace = (Place) getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());

        TextView addTextView = (TextView) listItemView.findViewById(R.id.address);
        addTextView.setText(currentPlace.getAdd());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_img);

        if (currentPlace.has_img()) {
            Log.e("P",currentPlace.getImg()+"");
            imageView.setImageResource(currentPlace.getImg());
            imageView.setVisibility(View.VISIBLE);

        } else{
            imageView.setVisibility(View.GONE);
            nameTextView.setTextColor(getContext().getResources().getColor(R.color.colorAccent));
        }
        Log.e("HH",currentPlace.getImg()+"");

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);


        if (currentPlace.has_phone()) {
            phoneTextView.setText(currentPlace.getPhone());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }
}
