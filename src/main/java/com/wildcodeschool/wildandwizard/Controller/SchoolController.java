package com.wildcodeschool.wildandwizard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.wildandwizard.repository.SchoolRepository;

@Controller
public class SchoolController {
	
	
	private SchoolRepository repository = new SchoolRepository();
	
	@GetMapping("/schools")
	public String getAll(Model model, @RequestParam(required = false, defaultValue="%")String country,
									  @RequestParam(required = false, defaultValue = "%")String id ) {
		
		model.addAttribute("schools", repository.findAll());
		model.addAttribute("schools", repository.findByCountry(country));
		model.addAttribute("schools", repository.findById(id));
		
		
		return "school_get_all";
	}
}
