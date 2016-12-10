package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    //this instance variable will hold color resource id for specific category
    private int mBackgroundColor;

    //constructor
    public LocationAdapter(Activity context, ArrayList<Location> locations, int backgroundColor) {
        super(context, 0, locations);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView; //recycling
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //find currentLocation in list_item
        Location currentLocation = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the name from the current Location object and
        // set this text on nameTextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the description from the current Location object and
        // set this text on the descriptionTextView
        descriptionTextView.setText(currentLocation.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Location object and
        // set the image to imageView
        imageView.setImageResource(currentLocation.getImageResourceId());

        // Find the LinearLayout in the list_item.xml layout with the ID text_container
        View textContainer = listItemView.findViewById(R.id.text_container);
        //use getColor method of ContextCompat class to translate int resourceId to actual color
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        //set that color as a background for individual category
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
