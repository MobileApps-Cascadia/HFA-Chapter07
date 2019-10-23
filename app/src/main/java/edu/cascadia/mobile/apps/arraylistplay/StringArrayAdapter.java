package edu.cascadia.mobile.apps.arraylistplay;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StringArrayAdapter extends RecyclerView.Adapter<StringArrayAdapter.ViewHolder> {
    //Basic class setup
    //CHECK: Add instance variable for the String[] data
    String [] providedDataArray;

    //CGECJ: Add constructor for the adapter that accepts a String[] and assigns it to the instance variable
    public StringArrayAdapter(String [] dataSource) {
        providedDataArray = dataSource;
    }
    //Create required methods for every RecyclerView.Adapter class
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //TODO: Inflate a new View with the checklist_item xml layout
        View thisView = LayoutInflater.from(parent.getContext()).inflate(R.layout.checklist_item, parent, false);

        //TODO: Use your view to create and return a new ViewHolder
        return new ViewHolder( thisView ); //Use your view instead of null
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //CHECK: Get the data from the String[] at the given position
        String dataItem = providedDataArray[position];
        //CHECK: Assign the data to the given holder's TextView
        holder.nameTextView.setText(dataItem);
    }

    @Override
    public int getItemCount() {
        //TODO: Use the size of the String[] to return the number of items in the list
        return providedDataArray.length;
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
