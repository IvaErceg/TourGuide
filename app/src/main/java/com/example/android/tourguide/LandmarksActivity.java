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
        //arayList of Location objects
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.upper), getString(R.string.upper_desc), R.drawable.upper));
        locations.add(new Location(getString(R.string.mirogoj), getString(R.string.mirogoj_desc), R.drawable.mirogoj));
        locations.add(new Location(getString(R.string.cathedral), getString(R.string.cath_desc), R.drawable.cathedral));
        locations.add(new Location(getString(R.string.church), getString(R.string.churc_desc), R.drawable.crkva));
        locations.add(new Location(getString(R.string.square), getString(R.string.square_desc), R.drawable.trg));
        locations.add(new Location(getString(R.string.tower), getString(R.string.tower_desc), R.drawable.lotrscak));
        locations.add(new Location(getString(R.string.gate), getString(R.string.gate_desc), R.drawable.kamenita));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryLandmarks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}