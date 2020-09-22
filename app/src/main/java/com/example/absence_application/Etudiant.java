package com.example.absence_application;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private String cne;

    public Etudiant(String nom, String prenom, String cne){
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
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

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    private static int lastContactId = 0;

    public static ArrayList<Etudiant> createContactsList(int numContacts) {
        ArrayList<Etudiant> contacts = new ArrayList<Etudiant>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Etudiant("Tareq " ,""+ ++lastContactId,"M144015604"));
        }

        return contacts;
    }
}
