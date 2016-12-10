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
        locations.add(new Location("Maksimir Park", "Maksimir Park is the oldest public park in Zagreb.", R.drawable.maksimir));
        locations.add(new Location("Zrinjevac", "Zrinjevac is a popular park in central Zagreb.", R.drawable.zrinjevac));
        locations.add(new Location("Jarun Lake", "Jarun lake is the location of the Jarun sports and leisure center.", R.drawable.jarun));
        locations.add(new Location("Botanical Garden Zagreb", "Founded in 1889 and home to many plant species.", R.drawable.botanical));
        locations.add(new Location("Zagreb Zoo", "Zagreb Zoo is a 7-hectare zoo located within Maksimir Park.", R.drawable.zoo));
        locations.add(new Location("Medvednica mountain (Sljeme)", "Medvednica is a mountain north of Zagreb with highest peak Sljeme.", R.drawable.medvednica));
        locations.add(new Location("Park Bundek", "Lake Bundek consists of the Big and the Small Lake. ", R.drawable.bundek));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.categoryParks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
