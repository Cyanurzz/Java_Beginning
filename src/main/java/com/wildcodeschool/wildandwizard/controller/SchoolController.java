package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController {

    private SchoolRepository repository = new SchoolRepository();

    @PostMapping("/school/create")
    public String postSchool(Model model,
                             @RequestParam String name,
                             @RequestParam Long capacity,
                             @RequestParam String country
    ) {
        model.addAttribute("school", repository.save(name, capacity, country));

        return "school_get";
    }
}
