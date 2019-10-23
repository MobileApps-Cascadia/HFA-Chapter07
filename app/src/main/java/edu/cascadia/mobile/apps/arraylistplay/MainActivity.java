package edu.cascadia.mobile.apps.arraylistplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //DONE: Refactor for RecyclerView
        setContentView(R.layout.activity_main_recyclerview);

        //Data stored in a String[]
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "Objective C"};

        //CHECK: Refactor for RecyclerView
        //Create an adapter
        /*ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myDataArray
        );
*/
        RecyclerView.Adapter<StringArrayAdapter.ViewHolder>  rvAdapter
                = new StringArrayAdapter(myDataArray);

        //CHECK: Refactor for RecyclerView
        //Get a reference to the view using findViewById
        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        //CHECK: Refactor for RecyclerView
        //Attach the adapter using its setAdapter method
        myRecyclerView.setAdapter(rvAdapter);
        myRecyclerView.setLayoutManager(new LinearLayoutManager((this)));
    }
}
