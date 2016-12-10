package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        //arrayList of Location objects
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.maksimir), getString(R.string.maks_desc), R.drawable.maksimir));
        locations.add(new Location(getString(R.string.zrinjevac), getString(R.string.zrinjevac_desc), R.drawable.zrinjevac));
        locations.add(new Location(getString(R.string.jarun), getString(R.string.jarun_desc), R.drawable.jarun));
        locations.add(new Location(getString(R.string.botanical), getString(R.string.botanical_desc), R.drawable.botanical));
        locations.add(new Location(getString(R.string.zoo), getString(R.string.zoo_desc), R.drawable.zoo));
        locations.add(new Location(getString(R.string.medvednica), getString(R.string.med_desc), R.drawable.medvednica));
        locations.add(new Location(getString(R.string.bundek), getString(R.string.bundek_desc), R.drawable.bundek));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryParks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
