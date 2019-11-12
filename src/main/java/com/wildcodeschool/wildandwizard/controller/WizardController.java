package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.WizardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
public class WizardController {

    private WizardRepository repository = new WizardRepository();

    @PostMapping("/wizard/create")
    public String postWizard(Model model,
                             @RequestParam String firstName,
                             @RequestParam String lastName,
                             @RequestParam Date birthday,
                             @RequestParam String birthPlace,
                             @RequestParam(required = false, defaultValue = "") String biography,
                             @RequestParam(required = false, defaultValue = "false") boolean muggle
    ) {
        model.addAttribute("wizard", repository.save(firstName, lastName,
                birthday, birthPlace, biography, muggle));

        return "wizard_get";
    }
}
