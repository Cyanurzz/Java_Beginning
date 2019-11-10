package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController {

    private SchoolRepository repository = new SchoolRepository();

    @GetMapping("/schools")
    public String getAll(Model model) {

        model.addAttribute("schools", repository.findAll());

        return "school_get_all";
    }

    @GetMapping("/school")
    public String getById(Model model, @RequestParam Long id) {

        model.addAttribute("school", repository.findById(id));

        return "school_get";
    }

    @GetMapping("/schools/search")
    public String getByCountry(Model model, @RequestParam String country) {

        model.addAttribute("schools", repository.findByCountry(country));

        return "school_get_all";
    }
}
