package com.example.intellectual_awareness;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBase extends SQLiteOpenHelper {
    public final static String  DB_NAME = "DATA";

    public DataBase(Context context) {
        super(context, DB_NAME, null, 1);
        SQLiteDatabase db= this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE SHBHAT(Sh_num INTEGER PRIMARY KEY AUTOINCREMENT , Sh_Data VARCHAR(255))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists DATA");
    }
}
