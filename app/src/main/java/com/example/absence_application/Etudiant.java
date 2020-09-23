package com.example.absence_application;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private int id;

    public Etudiant(String nom, String prenom, int id){
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    public Etudiant() {

    }


    public String getNom() {
        return nom;
    }

    public  void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static int lastContactId = 0;

    public static ArrayList<Etudiant> createContactsList(int numContacts) {
        ArrayList<Etudiant> contacts = new ArrayList<Etudiant>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Etudiant("Tareq " ,"EL Hariri",++lastContactId));
        }

        return contacts;
    }
}
