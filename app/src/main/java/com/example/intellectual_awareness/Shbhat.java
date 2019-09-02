package com.example.intellectual_awareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Shbhat extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().hide();
        ArrayList<Data> Shbhat = new ArrayList<>();
        Shbhat.add(new Data("أن العقوبات الشرعية قديمة وجامدة",R.raw.sh1));
        Shbhat.add(new Data("الشبهه الثانيه",2));
        Shbhat.add(new Data("الشبهه الثالثه",3));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));
        Shbhat.add(new Data("باقي الشبهات",4));


        DataADB itemsAdapter = new DataADB(this,Shbhat, 1);
        final ListView listView =  findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(view.getContext(), Display.class);
                Data data= (Data) parent.getAdapter().getItem(position);
                i.putExtra("body",data.getBody());
                startActivity(i);
            }
        });




    }


}


