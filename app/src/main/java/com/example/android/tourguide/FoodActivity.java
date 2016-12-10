package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        //arrayList of Location objects
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.duksa), getString(R.string.duksa_desc), R.drawable.duksa));
        locations.add(new Location(getString(R.string.mundoaka), getString(R.string.mundo_desc), R.drawable.mundoaka));
        locations.add(new Location(getString(R.string.zrno), getString(R.string.zrno_desc), R.drawable.zrno));
        locations.add(new Location(getString(R.string.vagabund), getString(R.string.vagabund_desc), R.drawable.vagabund));
        locations.add(new Location(getString(R.string.rocket), getString(R.string.rocket_desc), R.drawable.rocket));
        locations.add(new Location(getString(R.string.struk), getString(R.string.struk_desc), R.drawable.struk));
        locations.add(new Location(getString(R.string.otto), getString(R.string.otto_desc), R.drawable.otto));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryFood);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
