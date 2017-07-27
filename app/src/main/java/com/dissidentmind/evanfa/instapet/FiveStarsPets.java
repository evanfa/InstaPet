package com.dissidentmind.evanfa.instapet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class FiveStarsPets extends AppCompatActivity {
    //private RecyclerView listItemsSecond;
    //ArrayList<Pet> arrayItemSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_stars_pets);
        /**
         *Setting up "UP" to the main activity (Father Activity)
         * Update in Android Manifest
         */
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Toolbar miActionBarStar = (Toolbar) findViewById(R.id.miActionBarStar);
        //getSupportActionBar(miActionBarStar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /**
         * End Setting Up
         */

        /**
         * Start - Getting Values from Intent
         */
        Bundle params = getIntent().getExtras();

        if(params.size()!=0){
            System.out.println("Test Non Empty Params");
        }
        /**
         * End Getting values intent
         */


    }

}
