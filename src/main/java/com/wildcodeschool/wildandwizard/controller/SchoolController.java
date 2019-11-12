package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController {

    private SchoolRepository repository = new SchoolRepository();

    @GetMapping("/school/delete")
    public String deleteWizard(@RequestParam Long id) {

        repository.deleteById(id);

        return "redirect:/schools";
    }

    @GetMapping("/schools")
    public String getAll(Model model) {

        model.addAttribute("schools", repository.findAll());

        return "school_get_all";
    }
}
