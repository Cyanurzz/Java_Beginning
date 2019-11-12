package com.wildcodeschool.wildandwizard.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.wildandwizard.repository.WizardRepository;



@Controller
public class WizardController {
	
	
	private WizardRepository repository = new WizardRepository();
	
	@GetMapping("/wizards")
	public String getAll(Model model) {


		    model.addAttribute("wizards", repository.findAll()); // send the list to the template

		return "wizard_get_all";
	}
	
	@GetMapping("/wizards/search")
	public String getByLastName(Model model, @RequestParam(required = false, defaultValue="%") String lastName) {

		model.addAttribute("wizards", repository.findByLastName(lastName)); // send the list to the template 
	    return "wizard_get_all";
	}
	
}
