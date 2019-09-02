package com.example.intellectual_awareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DataBase mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        DataBase mydb=new DataBase(this);
    }
    public void GoToShbhat(View view){
        Intent intent =new Intent(this,Shbhat.class);
        startActivity(intent);
    }
    public void GoToBooks(View view){
        Intent intent =new Intent(this,Books.class);
        startActivity(intent);
    }
    public void GoToQuestions(View view){
        Intent intent =new Intent(this, Questions.class);
        startActivity(intent);
    }
    public void GoToAsk(View view){
        Intent intent =new Intent(this, Message.class);
        startActivity(intent);
    }



}


