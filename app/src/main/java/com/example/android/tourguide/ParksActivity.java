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
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("1", "lorem ipsum", R.drawable.lotrscak));
        locations.add(new Location("2", "lorem ipsum", R.drawable.crkva));
        locations.add(new Location("3", "lorem ipsum", R.drawable.lotrscak));
        locations.add(new Location("4", "lorem ipsum", R.drawable.trg));
        locations.add(new Location("5", "lorem ipsum", R.drawable.lotrscak));
        locations.add(new Location("6", "lorem ipsum", R.drawable.kamenita));
        locations.add(new Location("7", "lorem ipsum", R.drawable.lotrscak));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryParks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
