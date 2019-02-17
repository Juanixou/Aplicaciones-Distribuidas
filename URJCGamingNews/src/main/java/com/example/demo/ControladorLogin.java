package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogin {
	
	
	 @Autowired
	 private  UserRepository users;
	
	
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
		
		
		
		List<User> listaUsuarios = users.findByUsuario(uname);
		User usuario = listaUsuarios.get(0);
		
		if(usuario != null) {
		String pass = usuario.getPassword();
		
		if(pass.equals(psw)) {
			model.addAttribute("hayUsuario", "Si");
		}
		else {
			model.addAttribute("hayUsuario", "NO");
		}
		}

		return "checklogin";
	}
}
