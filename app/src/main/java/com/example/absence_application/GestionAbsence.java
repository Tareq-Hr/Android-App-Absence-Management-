package com.example.absence_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionAbsence extends AppCompatActivity {

    private ArrayList<Etudiant> etudiantsName = new ArrayList<>();
    private RecyclerView etudiants_list;
    private EtudiantsAdapter etudiantsAdapter;
    private Etudiant e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_absence);

        etudiants_list = findViewById(R.id.recyclerView2);

        etudiantsName = Etudiant.createContactsList(20);

        etudiantsAdapter = new EtudiantsAdapter(this, etudiantsName);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        this.etudiants_list.setLayoutManager(llm);
        this.etudiants_list.setAdapter(etudiantsAdapter);
    }


    public void AfficherListe(View view){
        String[] et;
        List<Etudiant> etudiantList = DAO.getAllEtudiants();
        ListView list = (ListView) findViewById(R.id.recyclerView2);

        if(etudiantList!=null){
            int i=0;
            et = new String[etudiantList.size()];
            for(Iterator it=etudiantList.iterator(); it.hasNext();){
                Etudiant e = (Etudiant) it.next();
                et[i] = e.getId()+" "+e.getPrenom()+" "+e.getNom();
                i++;
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,et);
            list.setAdapter(adapter);
        }
    }

}
