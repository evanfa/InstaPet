package com.dissidentmind.evanfa.instapet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listOfItems;
    ArrayList<Pet> arrayItem;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /**
        * App Bar Declaration
        */
       Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
       setSupportActionBar(miActionBar);

       listOfItems = (RecyclerView) findViewById(R.id.rvItems);
       LinearLayoutManager layoutManager = new LinearLayoutManager(this);
       layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
       listOfItems.setLayoutManager(layoutManager);

       startItems();
       startAdapater();
    }

    public void startItems(){
        arrayItem = new ArrayList<Pet>();

        arrayItem.add(new Pet("Panchita", 0,R.drawable.doggy1));
        arrayItem.add(new Pet("Pedrito", 0,R.drawable.doggy2));
        arrayItem.add(new Pet("Paty", 0,R.drawable.doggy3));
        arrayItem.add(new Pet("Birolo", 0,R.drawable.doggy4));
        arrayItem.add(new Pet("Tabata", 0,R.drawable.doggy5));
        arrayItem.add(new Pet("Chihuas", 0,R.drawable.doggy6));
        arrayItem.add(new Pet("Guapo", 0,R.drawable.doggy7));
        arrayItem.add(new Pet("Sadi", 0,R.drawable.doggy8));
        arrayItem.add(new Pet("Tepino", 0,R.drawable.doggy9));
        arrayItem.add(new Pet("Poncho", 0,R.drawable.doggy10));
    }

    public void startAdapater(){
        ItemAdapter adAdapter = new ItemAdapter(arrayItem, this);
        listOfItems.setAdapter(adAdapter);
    }

    // Inflate the menu; this adds items to the action bar if it is present.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
