package com.wildCodeSchool.JDBC1.SELECT.Controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildCodeSchool.JDBC1.SELECT.repository.WizardRepository;



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
	
	@PostMapping("/wizard/create")
	public String postWizard(Model model,@RequestParam String firstName,
	                         			 @RequestParam String lastName,
	                         			 @RequestParam Date birthday,
	                         			 @RequestParam String birthPlace,
	                         			 @RequestParam(required = false, defaultValue = "") String biography,
	                         			 @RequestParam(required = false, defaultValue = "false") boolean muggle ) {
		
	    model.addAttribute("wizards", repository.save(firstName, lastName, birthday, birthPlace, biography, muggle));
	    return "wizard_get";
	}
}
