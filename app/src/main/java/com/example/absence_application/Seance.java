package com.example.absence_application;

import java.util.Date;

public class Seance {
    private String cne;
    private int id_seance;
    private boolean isAbsent;
    private int id_filiere;
    private Date debut;
    private Date fin;

    public Seance(String cne, int id_seance, boolean isAbsent, int id_filiere, Date debut, Date fin) {
        this.cne = cne;
        this.id_seance = id_seance;
        this.isAbsent = isAbsent;
        this.id_filiere = id_filiere;
        this.debut = debut;
        this.fin = fin;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public int getId_seance() {
        return id_seance;
    }

    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    public void setAbsent(boolean absent) {
        isAbsent = absent;
    }

    public int getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(int id_filiere) {
        this.id_filiere = id_filiere;
    }
}
