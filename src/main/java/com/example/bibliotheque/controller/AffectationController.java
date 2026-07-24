package com.example.bibliotheque.controller;

import com.example.bibliotheque.model.Auteur;
import com.example.bibliotheque.model.Livre;
import com.example.bibliotheque.repository.AuteurRepository;
import com.example.bibliotheque.repository.LivreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AffectationController {

    @Autowired
    private AuteurRepository auteurRepository;

    @Autowired
    private LivreRepository livreRepository;

    @GetMapping("/affectation")
    public String afficherPage(Model model) {

        model.addAttribute("livres", livreRepository.findAll());
        model.addAttribute("auteurs", auteurRepository.findAll());

        return "affectation";
    }

    @PostMapping("/affectation")
    public String affecterAuteurLivre(
            @RequestParam String isbn,
            @RequestParam Long auteurId) {

        Livre livre = livreRepository.findById(isbn).orElse(null);
        Auteur auteur = auteurRepository.findById(auteurId).orElse(null);

        if (livre != null && auteur != null) {

            livre.getAuteurs().add(auteur);

            for (Auteur a : auteurRepository.findAll()) {
                if (a.getId().equals(auteurId)) {
                    a.setNombrePoint(a.getNombrePoint() + 5);
                    auteurRepository.save(a);
                }
            }

            livreRepository.save(livre);
        }

        return "redirect:/affectation";
    }
}