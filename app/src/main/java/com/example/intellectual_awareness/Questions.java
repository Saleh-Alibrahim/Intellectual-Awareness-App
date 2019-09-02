package com.example.intellectual_awareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Questions extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().hide();
        // Create a list of words
        ArrayList<Data> Questions = new ArrayList<>();
        Questions.add(new Data("لماذا يصوم المسلمون ؟",R.raw.q1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));
        Questions.add(new Data("باقي التساؤلات",1));

        DataADB itemsAdapter = new DataADB(this, Questions, 3);
        ListView listView =  findViewById(R.id.list);
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


