package com.example.bibliotheque.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomPrenom;

    private int nombrePoint;

    @ManyToMany
    private List<Livre> livres;

    public Auteur() {}

    public Auteur(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public Long getId() {
        return id;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }
}