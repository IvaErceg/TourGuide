package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**finding TextView with category id for each category
         * and setting onClickListener which will (onClick) start explicit intent to open specified activity
         */
        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(i);
            }
        });

        TextView museums = (TextView) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(i);
            }
        });

        TextView landmarks = (TextView) findViewById(R.id.landmarks);
        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LandmarksActivity.class);
                startActivity(i);
            }
        });

        TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(i);
            }
        });
    }

}