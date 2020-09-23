package com.example.absence_application;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {
    public static final int dbVersion = 1;
    public static final String dbName = "Etudiants.db";

    public static final String TABLE_ETUDIANTS = "Etudiants";

    public static final String col_id = "id";
    public static final String col_nom = "Nom";
    public static final String col_prenom = "Prenom";

    private static final String SQLCreate_TablesEtudiants = "CREATE TABLE " +
            TABLE_ETUDIANTS + " (" +
            col_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            col_nom + " TEXT NOT NULL, " +
            col_prenom + " TEXT NOT NULL);";

    private static final String SQLDeleteTableEtudiants ="DROP TABLE IF EXISTS "+TABLE_ETUDIANTS ;

    public MyDatabase (Context context) {
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(SQLCreate_TablesEtudiants);
        }catch (Exception e){
            Log.e("Creation Table Error", e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQLDeleteTableEtudiants);
        onCreate(db);

    }
}
