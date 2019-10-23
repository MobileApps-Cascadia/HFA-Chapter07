package edu.cascadia.mobile.apps.arraylistplay;

import androidx.appcompat.app.AppCompatActivity;

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
        String[] myDataArray = new String[] {"Java", "Kotlin", "Swift", "C","Ratfor","C shell/tcsh","C++","AMPL","Objective-C","C*","Perl","Java","S-Lang","SAC","Alef","Limbo","PHP","ECMAScript","C--","C#","Ch","D","eC","Cyclone","LSL","Squirrel","Go","OpenCL C","C0","Swift","AWK","BitC","LPC","Pike","Seed7","Processing","Split-C","Unified Parallel C","Cilk","Chapel","Fortress","Agora","BCPL","B","Nim","Nemerle","ApeScript","Amiga E","Lite-C","Newsqueak","Not eXactly C (NXC)","Not Quite C (NQC)","Oak","PROMAL","Handel-C","Dart","CINT","Cg","R","Hack","Charm","Claire","Noop","Neko","Axum","Umple","TOM (object-oriented programming language)","Telescript","Fantom","nesC","HolyC"};

        //TODO: Refactor for RecyclerView
        //Create an adapter
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

        //TODO: Set the RecyclerView's Layout Manager to a new LinearLayoutManager

        //TODO: Add ItemDecoration to the RecyclerView for the divider lines and spacing of 16
    }
}
