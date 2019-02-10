package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogin {
	
	/*
	 * Devuelve el formulario de login 
	 */
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	/*
	 * Devuelve la informacion obtenida del registro
	 */
	@PostMapping("/checklogin")
	public String checkLogin(Model model, @RequestParam String uname, @RequestParam String psw) {

		model.addAttribute("uname", uname);
		model.addAttribute("psw", psw);

		return "checklogin";
	}
}
