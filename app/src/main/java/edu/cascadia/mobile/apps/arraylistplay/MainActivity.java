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

        //Refactor for RecyclerView
        setContentView(R.layout.activity_main_recyclerview);

        //Data stored in a String[]
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "Objective C", "C#", "Python",
                "Javascript", "Node.js", "Java", "Kotlin", "Swift", "Objective C", "C#", "Python",
                "Javascript", "Node.js", "Java", "Kotlin", "Swift", "Objective C", "C#", "Python",
                "Javascript", "Node.js", "Java", "Kotlin", "Swift", "Objective C", "C#", "Python",
                "Javascript", "Node.js"};

        //TODO: Refactor for RecyclerView
        //Create an adapter
        RecyclerView.Adapter<StringArrayAdapter.ViewHolder> myAdapter =
                new StringArrayAdapter(myDataArray);

        //ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
        //        this,
        //        android.R.layout.simple_list_item_1,
        //        myDataArray
        //);

        //TODO: Refactor for RecyclerView
        //Get a reference to the view using findViewById
        //ListView myListView = (ListView) findViewById(R.id.myListView);

        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        //TODO: Refactor for RecyclerView
        //Attach the adapter using its setAdapter method
        myRecyclerView.setAdapter(myAdapter);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
