package com.dissidentmind.evanfa.instapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FiveStarsPets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_stars_pets);

        Bundle params = getIntent().getExtras();

        if(params.size()!=0){
            System.out.println("Test Non Empty Params");
        }
       // String petName = params.getString(String.valueOf(getString("petname")));
        //String petName = params.getString("petname");
        //String petValue = params.getString("petcalif");
       // Toast.makeText(this, "Test Lenght", Toast.LENGTH_SHORT).show();
        //String petPicture = params.getString("petpic");
        /**
         * Set Text into fields
         */
    }
}
