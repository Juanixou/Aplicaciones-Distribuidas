package com.example.demo;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogin {
	
	
	 @Autowired
	 private  UserRepository repositorioUser;
	
	
	/*
	 * Devuelve el formulario de login 
	 */
	@GetMapping("/login")
	public String login(Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
		model.addAttribute("token", token.getToken());
		return "login";
	}
	
	/*
	 * Devuelve la informacion obtenida del registro
	 */
	@PostMapping("/checklogin")
	public String checkLogin(Model model, @RequestParam String uname, @RequestParam String psw, HttpServletRequest request) {


		model.addAttribute("hayUsuario", "Nosesae");
		
		//List<User> listauser = repositorioUser.findByUsuario(request.getUserPrincipal().getName());
    	
    	//model.addAttribute("admin", request.isUserInRole("ADMIN"));
    	//model.addAttribute("uname", listauser.get(0).getUsuario());

		model.addAttribute("admin","ADMIIN");
		model.addAttribute("uname","NAME");
		
		return "checklogin";
	}
	
	@GetMapping("/logout")
	public String logout(Model model,HttpServletRequest request) {
		try {
			request.logout();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "logout";
	}
	
}
