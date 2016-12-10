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
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Museum of Broken Relationships", "Cirilometodska 2, Zagreb 10000, Croatia", R.drawable.broken));
        locations.add(new Location("Museum of Illusions", "Ilica 72, Zagreb 10000, Croatia", R.drawable.illusions));
        locations.add(new Location("Arts and Crafts Museum", "Trg Marshala Tita 10, Zagreb 10000, Croatia", R.drawable.arts));
        locations.add(new Location("Museum of Torture", "Ulica Pavla Radica 14 | 1st Floor, Zagreb 10000, Croatia", R.drawable.tortura));
        locations.add(new Location("Museum of Contemporary Art", "Avenija Dubrovnik 17, Zagreb 10000, Croatia", R.drawable.contemp));
        locations.add(new Location("Archaeological Museum", "Nikola Subic Zrinski Square 19, Zagreb 10000, Croatia", R.drawable.archeological));
        locations.add(new Location("Croatian Museum of Naive Art", "Ulica Sv. Cirila I Metoda 3, Zagreb, Croatia", R.drawable.naive));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryMuseums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
