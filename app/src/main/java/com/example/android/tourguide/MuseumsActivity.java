package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        //arrayList of Location objects
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.broken), getString(R.string.broken_desc), R.drawable.broken));
        locations.add(new Location(getString(R.string.illusions), getString(R.string.illu_desc), R.drawable.illusions));
        locations.add(new Location(getString(R.string.arts_crafts), getString(R.string.arts_desc), R.drawable.arts));
        locations.add(new Location(getString(R.string.torture), getString(R.string.torture_desc), R.drawable.tortura));
        locations.add(new Location(getString(R.string.cotemp_arts), getString(R.string.contemp_desc), R.drawable.contemp));
        locations.add(new Location(getString(R.string.archeological), getString(R.string.archeol_desc), R.drawable.archeological));
        locations.add(new Location(getString(R.string.naive), getString(R.string.naive_desc), R.drawable.naive));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryMuseums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
