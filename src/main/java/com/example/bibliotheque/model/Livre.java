package com.example.bibliotheque.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Livre {

    @Id
    private String isbn;  // ISBN is the primary key (not auto-generated)

    private String titre;
    private int anneeParution;

    @ManyToMany(mappedBy = "livres")
    private List<Auteur> auteurs;

    // === GETTERS & SETTERS ===
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public void setAnneeParution(int anneeParution) {
        this.anneeParution = anneeParution;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}