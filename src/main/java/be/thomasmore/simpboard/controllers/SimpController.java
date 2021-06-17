package be.thomasmore.simpboard.controllers;

import be.thomasmore.simpboard.model.Simp;
import be.thomasmore.simpboard.repositories.BierRepository;
import be.thomasmore.simpboard.repositories.SimpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
@Controller
public class SimpController {
    @Autowired
    private SimpRepository simpRepository;
    @Autowired
    private BierRepository bierRepository;
    @GetMapping("/afdelinglist")
    public String simpList(Model model) {
        model.addAttribute("simps", simpRepository.findAll());
        return "afdelinglist";
    }
    @GetMapping("/afdelingdetails/{id}")
    public String simpDetails(Model model,
                              @PathVariable(required = false) Integer id) {
        Optional<Simp> present = simpRepository.findById(id);
        if (present.isPresent() || id < simpRepository.count()) {
            model.addAttribute("simp", simpRepository.findById(id).get());
            model.addAttribute("simpPrevIndex", id > 1 ? id - 1 : simpRepository.count());
            model.addAttribute("simpNextIndex", id < simpRepository.count() ? id + 1 : 1);
            model.addAttribute("simpXbier",bierRepository.findAllBySimps(simpRepository.findById(id).get()));

        }
        return "afdelingdetails";
    }
    @GetMapping("/simpformulier/{id}")
    public String simpFormulier(Model model,
                                @PathVariable(required = false) Integer id) {

        return "simpFormulier";
    }
}
