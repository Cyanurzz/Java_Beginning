package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.repository.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController {

    private SchoolRepository repository = new SchoolRepository();

    @GetMapping("/school/update")
    public String getSchoolUpdate(Model model,
                                  @RequestParam Long id
    ) {
        model.addAttribute("school", repository.findById(id));

        return "school_update";
    }

    @PostMapping("/school/update")
    public String postSchoolUpdate(Model model,
                                   @RequestParam Long id,
                                   @RequestParam String name,
                                   @RequestParam Long capacity,
                                   @RequestParam String country
    ) {
        model.addAttribute("school", repository.update(id, name, capacity, country));

        return "school_get";
    }
}
