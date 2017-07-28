package com.dissidentmind.evanfa.instapet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class FiveStarsPets extends AppCompatActivity {
    //private RecyclerView listItemsSecond;
    //ArrayList<Pet> arrayItemSecond;

    private Toolbar starBar;
    private ActionMenuView amvMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_stars_pets);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            final ArrayList<String> arr = extras.getStringArrayList("valueStr");
            for(int wX = 0; wX < arr.size(); wX++){
                System.out.println(arr.get(wX));
            }
        }
        /**
         *Setting up "UP" to the main activity (Father Activity)
         * Update in Android Manifest
         */

        Toolbar miActionBar = (Toolbar) findViewById(R.id.starBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
