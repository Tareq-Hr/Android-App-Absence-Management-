package com.example.absence_application;

public class Filiere {
    private int id_filiere;
    private int id_classe;
    private String intitule_filiere;

    public Filiere(int id_classe, int id_filiere, String intitule_filiere){
        this.id_classe = id_classe;
        this.id_filiere = id_filiere;
        this.intitule_filiere = intitule_filiere;
    }

    public int getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(int id_filiere) {
        this.id_filiere = id_filiere;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public String getIntitule_filiere() {
        return intitule_filiere;
    }

    public void setIntitule_filiere(String intitule_filiere) {
        this.intitule_filiere = intitule_filiere;
    }
}
