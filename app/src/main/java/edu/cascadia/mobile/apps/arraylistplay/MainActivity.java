package edu.cascadia.mobile.apps.arraylistplay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
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
        RecyclerView.Adapter<StringArrayAdapter.ViewHolder> myAdapter = new StringArrayAdapter(myDataArray);

        //TODO: Refactor for RecyclerView
        //Get a reference to the view using findViewById
        RecyclerView myRecycleView = (RecyclerView) findViewById(R.id.myRecycler);

        //TODO: Refactor for RecyclerView
        //Attach the adapter using its setAdapter method
        myRecycleView.setAdapter(myAdapter);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
