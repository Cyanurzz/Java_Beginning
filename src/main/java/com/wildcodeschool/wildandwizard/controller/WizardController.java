package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.WizardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WizardController {

    private WizardRepository repository = new WizardRepository();

    @GetMapping("/wizard/delete")
    public String deleteWizard(@RequestParam Long id) {

        repository.deleteById(id);

        return "redirect:/wizards";
    }

    @GetMapping("/wizards")
    public String getAll(Model model) {

        model.addAttribute("wizards", repository.findAll());

        return "wizard_get_all";
    }
}
