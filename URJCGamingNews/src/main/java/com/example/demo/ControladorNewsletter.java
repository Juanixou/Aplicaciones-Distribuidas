package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorNewsletter {

	@Autowired
	 private  NewsletterRepository repositorioNewsletter;
	
	
	/*
	 * Devuelve el formulario de login 
	 */
	@GetMapping("/newsletter")
	public String login(Model model) {
		
		return "newsletter";
	}
	
	@PostMapping("/checkNewsletter")
	public String checkNewsletter(Model model, @RequestParam String umail) {
		
		
		List<Newsletter> listaEmail = repositorioNewsletter.findByEmail(umail);
		if(listaEmail.isEmpty()) {
			repositorioNewsletter.save(new Newsletter(umail));
			return "checkNewsletter";
		}else {
			return "inicio";
		}

	}
	
	
}
