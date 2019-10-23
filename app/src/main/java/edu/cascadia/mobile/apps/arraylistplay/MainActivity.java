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

        setContentView(R.layout.activity_main_recyclerview);

        //Data stored in a String[]
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "Objective C", "Python", "Javascript", "Ruby", "Node", "Java", "Kotlin", "Swift", "Objective C", "Python", "Javascript", "Ruby", "Node", "Java", "Kotlin", "Swift", "Objective C", "Python", "Javascript", "Ruby", "Node"};

        //create constructor for string array adapter
        RecyclerView.Adapter<StringArrayAdapter.ViewHolder> myAdapter = new StringArrayAdapter(myDataArray);

        //Get a reference to the view using findViewById
        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        //Attach the adapter using its setAdapter method
        myRecyclerView.setAdapter(myAdapter);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
