package com.example.intellectual_awareness;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataADB extends ArrayAdapter<Data> {
   private int Class;




    public DataADB(Context context, ArrayList<Data> d, int Class) {
       super(context, 0, d);
       this.Class = Class;
   }


    public View getView(int position, View convertView,ViewGroup parent){


        View ListItemView = convertView;
        if(ListItemView == null)
        {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Data currentData = getItem(position);

        TextView Title =  ListItemView.findViewById(R.id.t1);
        Title.setText(currentData.getTitle());


        if(Class==1)
        {



        }
        if(Class==2)
        {


        }
        if(Class==3)
        {


        }
        if(Class==4)
        {


        }

        return ListItemView;
    }

}

