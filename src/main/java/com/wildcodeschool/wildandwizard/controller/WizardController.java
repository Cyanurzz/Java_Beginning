package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.WizardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WizardController {

    private WizardRepository repository = new WizardRepository();

    @GetMapping("/wizards")
    public String getAll(Model model) {

        model.addAttribute("wizards", repository.findAll());

        return "wizard_get_all";
    }

    @GetMapping("/wizard")
    public String getById(Model model, @RequestParam Long id) {

        model.addAttribute("wizard", repository.findById(id));

        return "wizard_get";
    }

    @GetMapping("/wizards/search")
    public String getByLastName(Model model, @RequestParam String lastName) {

        model.addAttribute("wizards", repository.findByLastName(lastName));

        return "wizard_get_all";
    }
}
