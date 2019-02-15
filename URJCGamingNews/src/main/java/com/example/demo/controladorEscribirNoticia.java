package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class controladorEscribirNoticia {
	
	
	 @Autowired
	 private  ArticuloRepository artic;
	 

	@GetMapping("/escribirNoticia")
	public String escribirNoticia (Model mod3el) {
		
		return "escribirNoticia";
	}
	
	
	
	@PostMapping("/checkNew")
	public String checkNew(Model model, @RequestParam String uname, @RequestParam String titulo,
			String subirImagen,@RequestParam String textoNoticia, @RequestParam String descripcion) {

		model.addAttribute("uname", uname);
		model.addAttribute("titulo", titulo);
		model.addAttribute("descripcion", descripcion);
		model.addAttribute("subirImagen",subirImagen);
		model.addAttribute("textoNoticia", textoNoticia);
		
		
		LocalDate localDate = LocalDate.now();
		 
		Articulo articulo = new Articulo(titulo,descripcion,textoNoticia,
					"RDR2.png",localDate.toString(),uname);
			
		artic.save(articulo);

		return "checkNew";
	}

}
