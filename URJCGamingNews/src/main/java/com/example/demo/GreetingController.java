package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@Autowired
	private DatabaseController db;
	
	@GetMapping("/prueba")
	 public String greeting(Model model) {
		
		db.SacarArticulo();

		 model.addAttribute("name", "URJC Gaming News");
		 model.addAttribute("resources", "/resources");

		 return "index";
	 }

}
