package com.example.listview2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
       private ArrayList<Animal> animals;
       private Activity activity;


    public CustomAdapter(ArrayList<Animal> animals, Activity activity) {
        this.animals = animals;
        this.activity = activity;
      
    }





    @Override
    public int getCount () {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return (position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"ViewHolder", "ResourceType"})
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= activity.getLayoutInflater();
        view = inflater.inflate(R.layout.list_item,parent,false);
        TextView textView =view.findViewById(R.id.tv);
        ImageView imageView=view.findViewById(R.id.iv);
       imageView.setImageResource(animals.get(position).getPictures());
       textView.setText(animals.get(position).getName());

        return view ;
    }

}
