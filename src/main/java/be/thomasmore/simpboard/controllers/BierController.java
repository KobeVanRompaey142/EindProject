package be.thomasmore.simpboard.controllers;

import be.thomasmore.simpboard.model.Bier;
import be.thomasmore.simpboard.repositories.BierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
@Controller
public class BierController {
    @Autowired
    private BierRepository bierRepository;
    private Logger logger = LoggerFactory.getLogger(BierController.class);
    @GetMapping("/bierlist")
    public String bierList(Model model,
                           @RequestParam(required = false) Integer minAlcohol,
                           @RequestParam(required = false) String biernaam) {
    logger.info(String.format("bierByFilter -- min=%d,  biernaam=%s",minAlcohol,biernaam));
        List<Bier> findByFilter = bierRepository.findByFilter(minAlcohol,biernaam);
    model.addAttribute("minAlcohol", minAlcohol);
    model.addAttribute("biernaam",biernaam);
    model.addAttribute("bieren", findByFilter);
        return "bierlist";
    }
    @GetMapping("/bierdetails/{id}")
    public String bierDetails(Model model,
                               @PathVariable(required = false) Integer id) {
        Optional<Bier> present = bierRepository.findById(id);
        if (present.isPresent() || id < bierRepository.count()) {
            model.addAttribute("bier", bierRepository.findById(id).get());
            model.addAttribute("bierPrevIndex", id > 1 ? id - 1 : bierRepository.count());
            model.addAttribute("bierNextIndex", id < bierRepository.count() ? id + 1 : 1);
        }
        return "bierdetails";
    }
}
