package be.thomasmore.simpboard.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {
    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
   public String home(Model model,
                       Principal principal) {
        final String loginName = (principal != null) ? principal.getName() : "NOBODY";
        logger.info("home - logged in: "+loginName);
        return "home";
    }
    @GetMapping("/gallery")
    public String gallery(Model model){
        return "gallery";
    }
}
