package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import guru.springframework.repositories.PersonRepository;

@Controller
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	

	 @RequestMapping("/person")
	    public String person(Model model) {
		 	System.out.println("inside person");
		 	
		 	//System.out.println(personRepository.findAll());
	        model.addAttribute("persons", personRepository.findAll());
	        return "persons";
	    }
}
