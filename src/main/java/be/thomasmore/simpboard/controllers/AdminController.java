package be.thomasmore.simpboard.controllers;


import be.thomasmore.simpboard.model.Bier;
import be.thomasmore.simpboard.model.Simp;
import be.thomasmore.simpboard.repositories.BierRepository;
import be.thomasmore.simpboard.repositories.SimpRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/admin")
@Controller
public class AdminController {
    @Autowired
    private SimpRepository simpRepository;
    @Autowired
    private BierRepository bierRepository;
    private Logger logger = LoggerFactory.getLogger(AdminController.class);

    @GetMapping("/simpinvulformulier/{id}")
    public String simpInvulFormulier(Model model,
                                     @PathVariable(required = false) Integer id) {
        logger.info(String.format("simpInvulFormulier -- id=%d", id));
        if (id == null) return "admin/simpinvulformulier";
        Optional<Simp> optionalSimp = simpRepository.findById(id);
        Iterable<Simp> simps = simpRepository.findAll();
        if (optionalSimp.isPresent()) {
            model.addAttribute("simp", optionalSimp.get());
            model.addAttribute("simps", simps);
        }
        return "admin/simpinvulformulier";
    }


    @PostMapping("/simpinvulformulier/{id}")
    public String simpInvulFormulierPost(Model model,
                                         @PathVariable(required = false) Integer id,
                                         @ModelAttribute("simp") Simp simp) {
        Optional<Simp> optionalSimp = simpRepository.findById(id);
        if (optionalSimp.isPresent()) {
            Simp simpPuntenEdit = optionalSimp.get();
            simpPuntenEdit.setPunten(simp.getPunten());
            simpRepository.save(simpPuntenEdit);
            model.addAttribute("simp", optionalSimp.get());
        }
        return "/admin/simpinvulformulier";
    }
    @GetMapping("/biernew")
    public String bierNew(Model model) {
    model.addAttribute("bier", new Bier());
        return "/admin/biernew";
    }
    @PostMapping("/biernew")
    public String bierNewPost(Model model,
                              @ModelAttribute Bier bier) {
        bierRepository.save(bier);
        return "redirect:/bierlist";
    }
}
