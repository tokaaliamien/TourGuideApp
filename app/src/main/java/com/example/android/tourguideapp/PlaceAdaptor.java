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
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.R.attr.width;

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
            //imageView.setImageBitmap(decodeSampleBitmapFromResource(currentPlace.getImg(),imageView.getWidth(), imageView.getHeight()));

            imageView.setVisibility(View.VISIBLE);

        } else{
            imageView.setVisibility(View.GONE);
            nameTextView.setTextColor(getContext().getResources().getColor(R.color.colorAccent));
        }
        Log.e("HH",currentPlace.getImg()+"");

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        TextView phoneLable = (TextView) listItemView.findViewById(R.id.phone_label);


        if (currentPlace.has_phone()) {
            phoneTextView.setText(currentPlace.getPhone());
            phoneTextView.setVisibility(View.VISIBLE);
            phoneLable.setVisibility(View.VISIBLE);

        } else {
            phoneTextView.setVisibility(View.GONE);
            phoneLable.setVisibility(View.GONE);
        }

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.ratingBar);
        TextView rateLable = (TextView) listItemView.findViewById(R.id.ratingBar_label);

        if (currentPlace.has_rate()) {
            ratingBar.setRating(currentPlace.getRating());
            ratingBar.setVisibility(View.VISIBLE);
            rateLable.setVisibility(View.VISIBLE);

        } else {
            ratingBar.setVisibility(View.GONE);
            rateLable.setVisibility(View.GONE);
        }


        return listItemView;

    }
}
