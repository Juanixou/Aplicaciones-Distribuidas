package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	
	
	@GetMapping("/prueba")
	 public String greeting(Model model) {
	 model.addAttribute("name", "URJC Gaming News");
	 model.addAttribute("resources", "/resources");
/*	 
	 model.addAttribute("css","/URJCGamingNews/src/main/resources/templates/layout/styles/layout.css");
	 model.addAttribute("kh3","/URJCGamingNews/src/main/resources/templates/images/kh3.jpg");
	 model.addAttribute("jquerymin","/URJCGamingNews/src/main/resources/templates/layout/scripts/jquery.min.js");
	 model.addAttribute("jquerybacktotop","/URJCGamingNews/src/main/resources/templates/layout/scripts/jquery.backtotop.js");
	 model.addAttribute("jquerymobile","/URJCGamingNews/src/main/resources/templates/layout/scripts/jquery.mobilemenu.js");
	 model.addAttribute("slider","/URJCGamingNews/src/main/resources/templates/layout/scripts/slider.js");
*/	 
	 return "index";
	 }

}
