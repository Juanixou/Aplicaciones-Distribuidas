package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorNewsletter {

	@Autowired
	 private  NewsletterRepository repositorioNewsletter;
	

	@GetMapping("/newsletter")
	public String login(Model model, HttpServletRequest request) {
		
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
		model.addAttribute("token", token.getToken());
		return "newsletter";
	}
	
	@PostMapping("/checkNewsletter")
	public String checkNewsletter(Model model, @RequestParam String umail, HttpServletRequest request) {
		
		if(request.isUserInRole("ADMIN")) {
			model.addAttribute("loginURL", "/logout");
			model.addAttribute("loginName", "Logout");
		}else {
			model.addAttribute("loginURL", "/login");
			model.addAttribute("loginName", "Login");
		}
		
		List<Newsletter> listaEmail = repositorioNewsletter.findByEmail(umail);
		if(listaEmail.isEmpty()) {
			repositorioNewsletter.save(new Newsletter(umail));
			return "checkNewsletter";
		}else {
			return "inicio";
		}

	}
	
	
}
