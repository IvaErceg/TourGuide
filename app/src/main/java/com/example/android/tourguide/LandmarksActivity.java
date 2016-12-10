package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Upper Town", "Upper Town is home to cathedral and the parliament building.", R.drawable.upper));
        locations.add(new Location("Mirogoj Cemetary", "The cemetery was created in 1876.", R.drawable.mirogoj));
        locations.add(new Location("Cathedral of the Assumption", "Cathedral is a Roman Catholic institution built in Gothic style.", R.drawable.cathedral));
        locations.add(new Location("St.Mark's Church", "St. Mark's Church is easily recognizable by its colourful roof.", R.drawable.crkva));
        locations.add(new Location("Jelacic Square", "Ban Jelacic Square is the central square of the city of Zagreb.", R.drawable.trg));
        locations.add(new Location("Lotrscak Tower", "The Lotrscak Tower is a fortified tower which dates to the 13th century.", R.drawable.lotrscak));
        locations.add(new Location("Stone gate", "Stone Gates are the only preserved part of old fortifications.", R.drawable.kamenita));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryLandmarks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}