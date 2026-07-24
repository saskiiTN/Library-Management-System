package com.example.bibliotheque.controller;

import com.example.bibliotheque.model.Livre;
import com.example.bibliotheque.repository.LivreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/livres")
public class LivreController {

    private final LivreRepository livreRepository;

    public LivreController(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

   @GetMapping
    public String livresPage(Model model) {

        model.addAttribute("livres", livreRepository.findAll());
        model.addAttribute("livre", new Livre());
        return "livres";
    }

    @PostMapping("/add")
    public String addLivre(@ModelAttribute Livre livre) {

        livreRepository.save(livre);
        return "redirect:/livres";
    }
}