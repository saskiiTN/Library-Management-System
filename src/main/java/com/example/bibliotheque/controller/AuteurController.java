package com.example.bibliotheque.controller;

import com.example.bibliotheque.model.Auteur;
import com.example.bibliotheque.repository.AuteurRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auteurs")
public class AuteurController {

    private final AuteurRepository auteurRepository;

    public AuteurController(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    @GetMapping
    public String auteursPage(Model model) {

        model.addAttribute("auteur", new Auteur());
        model.addAttribute("auteurs", auteurRepository.findAll());

        return "auteurs";
    }

    @PostMapping("/add")
    public String addAuteur(@ModelAttribute Auteur auteur) {

        auteur.setNombrePoint(0);
        auteurRepository.save(auteur);

        return "redirect:/auteurs";
    }
}