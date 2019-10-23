package edu.cascadia.mobile.apps.arraylistplay;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StringArrayAdapter extends RecyclerView.Adapter<StringArrayAdapter.ViewHolder> {
    //Basic class setup
    // Add instance variable for the String[] data
    String[] myDataArray;

    //Add constructor for the adapter that accepts a String[] and assigns it to the instance variable
    public StringArrayAdapter(String[] myDataArray) {
        this.myDataArray = myDataArray;
    }

    //Create required methods for every RecyclerView.Adapter class
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //TODO: Inflate a new View with the checklist_item xml layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.checklist_item, parent, false);
        //TODO: Use your view to create and return a new ViewHolder
        return new ViewHolder(view ); //Use your view instead of null
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //TODO: Get the data from the String[] at the given position
        String string = myDataArray[position];
        //TODO: Assign the data to the given holder's TextView
        holder.nameTextView.setText(string);
    }

    @Override
    public int getItemCount() {
        //TODO: Use the size of the String[] to return the number of items in the list
        return myDataArray.length; //nothing will display while this is returning 0
    }


    //ViewHolder Class
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;

        public ViewHolder(View v){
            super(v);

            nameTextView = (TextView) v.findViewById(R.id.checklist_item_name);
        }
    }


}
