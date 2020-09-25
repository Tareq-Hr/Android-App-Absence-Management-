package com.example.absence_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionAbsence extends AppCompatActivity {

    private RecyclerView etudiants_list;
    private EtudiantsAdapter etudiantsAdapter;
    private Etudiant e;
    private DAO dao;
    private MyDatabase mydb;
    private SQLiteDatabase db;
    private final String DELETE_TABLE = "delete from Etudiants";
    private final String AJOUTER_ETUDIANTS = "insert into Etudiants(nom,prenom) values ('EL HARIRI','TAREQ'),('ESSADIQ','LAKHLIFI')," +
            "('ELBOUNI','FATIMA ZAHRA'),('AISSAOUI','ALI'),('OUBTOU','MOHAMED'),('NASSIMI','ANAS'),('YAZIDI','IMRAN')," +
            "('ZOUITNI','CHAIMAE'),('BEN BAHYA','ILHAM'),('ELABOUI','HAFIDA')";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_absence);

        etudiants_list = findViewById(R.id.recyclerView2);

        dao = new DAO(getApplicationContext());

        System.out.println(dao.getAllEtudiants().toString());
        String[] et;
        ArrayList<Etudiant> etudiantList = dao.getAllEtudiants();
        if(etudiantList!=null){
            int i=0;
            et = new String[etudiantList.size()];
            for(Iterator it=etudiantList.iterator(); it.hasNext();){
                Etudiant e = (Etudiant) it.next();
                et[i] = e.getId()+" "+e.getPrenom()+" "+e.getNom();
                i++;
            }

            etudiantsAdapter = new EtudiantsAdapter(this, etudiantList);
            LinearLayoutManager llm = new LinearLayoutManager(this);
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            etudiants_list.setLayoutManager(llm);
            etudiants_list.setAdapter(etudiantsAdapter);

            mydb = new MyDatabase(getApplicationContext());

        }
    }

    public void delete_db(View view){
        db = mydb.getWritableDatabase();
        db.execSQL(DELETE_TABLE);
        db.execSQL(AJOUTER_ETUDIANTS);
    }


}
