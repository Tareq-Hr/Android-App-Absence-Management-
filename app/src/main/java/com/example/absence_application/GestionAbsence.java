package com.example.absence_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class GestionAbsence extends AppCompatActivity {

    private ArrayList<Etudiant> etudiantsName = new ArrayList<>();
    private RecyclerView etudiants_list;
    private EtudiantsAdapter etudiantsAdapter;

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


}
