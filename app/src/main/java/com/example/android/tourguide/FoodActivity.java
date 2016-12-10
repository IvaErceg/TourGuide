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
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Duksa Pizza", "Duknoviceva Ulica 4, Zagreb 10000, Croatia", R.drawable.duksa));
        locations.add(new Location("Mundoaka Street Food", "Petrinjska Ulica 2, Zagreb 10000, Croatia", R.drawable.mundoaka));
        locations.add(new Location("Zrno bio bistro", "Meduliceva Ulica 20, Zagreb 10000, Croatia", R.drawable.zrno));
        locations.add(new Location("Vagabund", "Vlashka Ulica 90, Zagreb 10000, Croatia", R.drawable.vagabund));
        locations.add(new Location("Rocket Burger Cafe", "Tkalchiceva Ulica 44, Zagreb 10000, Croatia", R.drawable.rocket));
        locations.add(new Location("La Struk", "Skalinska Ulica 5, Zagreb 10000, Croatia", R.drawable.struk));
        locations.add(new Location("Otto&Frank", "Tkalciceva 20, Zagreb 10000, Croatia", R.drawable.otto));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryFood);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
