package edu.cascadia.mobile.apps.arraylistplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: Refactor for RecyclerView
        setContentView(R.layout.activity_main_recyclerview);

        //Data stored in a String[]
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "Objective C"};

        //TODO: Refactor for RecyclerView
        //Create an adapter
        StringArrayAdapter adapter = new StringArrayAdapter(myDataArray);

        //TODO: Refactor for RecyclerView
        //Get a reference to the view using findViewById
        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false));

        //TODO: Refactor for RecyclerView
        //Attach the adapter using its setAdapter method
        myRecyclerView.setAdapter(adapter);
    }
}
