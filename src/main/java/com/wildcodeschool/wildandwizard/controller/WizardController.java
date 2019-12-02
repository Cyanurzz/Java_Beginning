package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.entity.Course;
import com.wildcodeschool.wildandwizard.entity.Wizard;
import com.wildcodeschool.wildandwizard.repository.CourseRepository;
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
public class WizardController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private WizardRepository wizardRepository;

    @GetMapping("/")
    public String getWizards(Model out) {

        out.addAttribute("wizards", wizardRepository.findAll());

        return "wizards";
    }

    @GetMapping("/wizard/register")
    public String getRegister(Model out,
                              @RequestParam Long idWizard) {

        Optional<Wizard> optionalWizard = wizardRepository.findById(idWizard);
        Wizard wizard = new Wizard();
        if (optionalWizard.isPresent()) {
            wizard = optionalWizard.get();
        }
        out.addAttribute("wizard", wizard);
        out.addAttribute("allCourses", courseRepository.findAll());

        // call the method getCourses in Wizard
        List<Course> courses = new ArrayList<>();
        Method method = getMethod(wizard, "getCourses",
                new Class[]{});
        if (method != null) {
            try {
                courses = (List<Course>) method.invoke(wizard);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        out.addAttribute("wizardCourses", courses);

        return "register";
    }

    @PostMapping("/wizard/register")
    public String postRegister(@RequestParam Long idWizard,
                               @RequestParam Long idCourse) {

        Optional<Wizard> optionalWizard = wizardRepository.findById(idWizard);
        if (optionalWizard.isPresent()) {
            Wizard wizard = optionalWizard.get();

            Optional<Course> optionalCourse = courseRepository.findById(idCourse);
            if (optionalCourse.isPresent()) {
                Course course = optionalCourse.get();

                // call the method getCourses in Wizard
                List<Course> courses;
                Method method = getMethod(wizard, "getCourses",
                        new Class[]{});
                if (method != null) {
                    try {
                        courses = (List<Course>) method.invoke(wizard);
                        courses.add(course);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

                wizardRepository.save(wizard);
            }
        }

        return "redirect:/wizard/register?idWizard=" + idWizard;
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
