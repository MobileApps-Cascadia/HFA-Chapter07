package edu.cascadia.mobile.apps.arraylistplay;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StringArrayAdapter extends RecyclerView.Adapter<StringArrayAdapter.ViewHolder> {
    //Basic class setup

    String[] contents;

    public StringArrayAdapter(String[] input){
        contents = input;
    }

    //Create required methods for every RecyclerView.Adapter class
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View recyclerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.checklist_item, parent, false);
        return new ViewHolder(recyclerView); //Use your view instead of null
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = contents[position];
        holder.nameTextView.setText(item);
    }

    @Override
    public int getItemCount() {
        int itemcount = contents.length;
        return itemcount;
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
