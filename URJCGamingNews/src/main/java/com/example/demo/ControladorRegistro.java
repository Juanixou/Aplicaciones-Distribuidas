package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorRegistro {
	@GetMapping("/registrar")
	public String registrar(Model model) {

		return "registrar";
	}

	@PostMapping("/checkregistro")
	public String checkRegistro(Model model, @RequestParam String uname, @RequestParam String email,
			@RequestParam String psw, @RequestParam String psw_repeat) {

		model.addAttribute("uname", uname);
		model.addAttribute("email", email);
		model.addAttribute("psw", psw);
		model.addAttribute("psw_repeat", psw_repeat);
		if (psw.equals(psw_repeat))
			model.addAttribute("psw_confirmation", "Si");
		else
			model.addAttribute("psw_confirmation", "No");

		return "checkregistro";
	}
}
