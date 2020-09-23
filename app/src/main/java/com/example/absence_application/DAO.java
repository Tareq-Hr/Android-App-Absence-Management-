package com.example.absence_application;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static SQLiteDatabase sql_db;
    private static MyDatabase my_db;

    public DAO(Context context){
        my_db =  new MyDatabase(context);
        sql_db = my_db.getWritableDatabase();
        my_db.onCreate(sql_db);
    }

    public void AjouterEtudiants(Etudiant e){
        sql_db = my_db.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(MyDatabase.col_nom, "tareq");
        contentValues.put(MyDatabase.col_prenom, "har");

        try {
            sql_db.insert(MyDatabase.TABLE_ETUDIANTS, null, contentValues);
        }catch (SQLiteException ex){
            Log.e("InsertError", ex.getMessage());
        }
    }

    public static List<Etudiant> getAllEtudiants(){
        sql_db = my_db.getReadableDatabase();
        List<Etudiant> etudiantList = new ArrayList<Etudiant>();

        Cursor cursor = sql_db.rawQuery("SELECT * FROM "+my_db.TABLE_ETUDIANTS,null);
        if(cursor!=null){
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                Etudiant etudiant = cursorToEtudiant(cursor);
                etudiantList.add(etudiant);
                cursor.moveToNext();
            }
            cursor.close();
        }

        return etudiantList;
    }

    private static Etudiant cursorToEtudiant(Cursor cursor) {
        Etudiant etudiant = new Etudiant();
        etudiant.setId(cursor.getInt(0));
        etudiant.setNom(cursor.getString(1));
        etudiant.setPrenom(cursor.getString(2));

        return etudiant;
    }
}
