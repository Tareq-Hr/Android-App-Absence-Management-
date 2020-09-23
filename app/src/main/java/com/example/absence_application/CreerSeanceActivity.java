package com.example.absence_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreerSeanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_seance);
    }

    public void creerSeance(View view) {
        Intent intent = new Intent(CreerSeanceActivity.this, GestionAbsence.class);
        startActivity(intent);
    }
}
