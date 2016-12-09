package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID miwok
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the miwok translation from the current Word object and
        // set this text on the miwok TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID english
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the english translation from the current Word object and
        // set this text on the english TextView
        descriptionTextView.setText(currentLocation.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and
        // set the image to imageView

        imageView.setImageResource(currentLocation.getImageResourceId());

/*
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        textContainer.setBackgroundColor(color);*/


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
