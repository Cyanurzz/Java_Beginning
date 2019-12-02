package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.entity.School;
import com.wildcodeschool.wildandwizard.entity.Wizard;
import com.wildcodeschool.wildandwizard.repository.SchoolRepository;
import com.wildcodeschool.wildandwizard.repository.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private WizardRepository wizardRepository;

    @GetMapping("/")
    public String getSchools(Model out) {

        out.addAttribute("schools", schoolRepository.findAll());

        return "schools";
    }

    @GetMapping("/school/register")
    public String inscription(Model out,
                              @RequestParam Long idSchool) {

        Optional<School> optionalSchool = schoolRepository.findById(idSchool);
        School school = new School();
        if (optionalSchool.isPresent()) {
            school = optionalSchool.get();
        }
        out.addAttribute("school", school);
        out.addAttribute("allWizards", wizardRepository.findAll());

        // call the method getWizards in School
        List<Wizard> wizards = new ArrayList<>();
        Method method = getMethod(school, "getWizards",
                new Class[]{});
        if (method != null) {
            try {
                wizards = (List<Wizard>) method.invoke(school);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        out.addAttribute("schoolWizards", wizards);

        return "register";
    }

    @PostMapping("/school/register")
    public String inscription(@RequestParam Long idSchool,
                              @RequestParam Long idWizard) {

        Optional<Wizard> optionalWizard = wizardRepository.findById(idWizard);
        if (optionalWizard.isPresent()) {
            Wizard wizard = optionalWizard.get();

            Optional<School> optionalSchool = schoolRepository.findById(idSchool);
            if (optionalSchool.isPresent()) {
                School school = optionalSchool.get();

                // call the method setSchool in Wizard
                Method method = getMethod(wizard, "setSchool",
                        new Class[]{School.class});
                if (method != null) {
                    try {
                        method.invoke(wizard, school);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
                wizardRepository.save(wizard);
            }
        }

        return "redirect:/school/register?idSchool=" + idSchool;
    }

    public Method getMethod(Object obj, String methodName, Class[] args) {
        Method method;
        try {
            method = obj.getClass().getDeclaredMethod(methodName, args);
            return method;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
