package edu.cascadia.mobile.apps.arraylistplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: Refactor for RecyclerView
        setContentView(R.layout.activity_main);

        //Data stored in a String[]
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "Objective C"};

        //TODO: Refactor for RecyclerView
        //Create an adapter
        RecyclerView.Adapter<StringArrayAdapter.ViewHolder> Adapter = new StringArrayAdapter(myDataArray);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myDataArray
        );

        //TODO: Refactor for RecyclerView
        //Get a reference to the view using findViewById
        ListView myListView = (ListView) findViewById(R.id.myListView);

        //TODO: Refactor for RecyclerView
        //Attach the adapter using its setAdapter method
        myListView.setAdapter(myAdapter);
    }
}
