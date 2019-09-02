package com.example.intellectual_awareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Books extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().hide();
        ArrayList<Data> Books = new ArrayList<>();
        Books.add(new Data("كتاب تجديد الوعي",R.raw.book1,"https://drive.google.com/file/d/1YVWB06nt7szuKqHEmc9UhVcJvJ7pTaGJ/view"));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));
        Books.add(new Data("باقي الكتب",1));

        DataADB itemsAdapter = new DataADB(this,Books, 2);
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(view.getContext(), Display.class);
                Data data= (Data) parent.getAdapter().getItem(position);
                i.putExtra("body",data.getBody());
                i.putExtra("link",data.getLink());
                startActivity(i);
            }
        });


    }


}


