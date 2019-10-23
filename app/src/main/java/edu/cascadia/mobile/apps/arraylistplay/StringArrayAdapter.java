package edu.cascadia.mobile.apps.arraylistplay;


import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class StringArrayAdapter extends RecyclerView.Adapter<StringArrayAdapter.ViewHolder> {
    //Basic class setup
    //TODO: Add instance variable for the String[]
    private String[] mData;

    //TODO: Add constructor for the adapter that accepts a String[] and assigns it to the instance variable
    public StringArrayAdapter(String[] data){
        mData = data;
    }

    //Create required methods for every RecyclerView.Adapter class
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //TODO: Inflate a new View with the checklist_item xml layout

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.checklist_item, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)v.findViewById(R.id.checklist_item_name);
                Intent browserIntent = new Intent();

                switch(textView.getText().toString()){
                    case "Java":
                        browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.oracle.com/en/java/"));
                        break;
                    case "Kotlin":
                        browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlinlang.org/docs/reference/"));
                        break;
                    case "Objective C":
                        browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/Introduction/Introduction.html"));
                        break;
                    case "Swift":
                        browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://swift.org/documentation/"));
                        break;
                    default:
                        break;
                }

                v.getContext().startActivity(browserIntent);
            }
        });

        //TODO: Use your view to create and return a new ViewHolder
        return new ViewHolder(view ); //Use your view instead of null
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //TODO: Get the data from the String[] at the given position
        String entry = mData[position];

        //TODO: Assign the data to the given holder's TextView
        holder.nameTextView.setText(entry);

        //Not required. thought it was a fun way to set the true/false flag.
        long ms = System.currentTimeMillis();
        holder.checkBox.setChecked(ms % 2 == 0);
    }

    @Override
    public int getItemCount() {
        //TODO: Use the size of the String[] to return the number of items in the list
        return mData.length; //nothing will display while this is returning 0
    }


    //ViewHolder Class
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public CheckBox checkBox;

        public ViewHolder(View v){
            super(v);

            nameTextView = (TextView) v.findViewById(R.id.checklist_item_name);
            checkBox = (CheckBox) v.findViewById(R.id.checkbox_trueFalse);
        }
    }
}
