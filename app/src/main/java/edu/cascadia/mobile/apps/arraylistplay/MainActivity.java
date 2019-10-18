package edu.cascadia.mobile.apps.arraylistplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myDataArray = new String[] {"java", "android", "python", "swift"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myDataArray
        );

        //Get a reference to the list view using findViewById
        ListView myListView = (ListView) findViewById(R.id.myListView);

        //Attach the adapter to the list view reference using its setAdapter method
        myListView.setAdapter(myAdapter);
    }
}
