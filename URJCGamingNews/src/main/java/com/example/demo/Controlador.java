package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("/noticia")
	public String noticia(Model model) {

		
		ClaseGuardarTextoNoSirveParaNada texto = new ClaseGuardarTextoNoSirveParaNada();
		
		
		
		/*
		 * Noticia
		 */
		model.addAttribute("titulo_noticia", "TITULO_NOTICIA"); //Titulo de la notica
		model.addAttribute("ruta_imagen_principal","images/RDR2.png");//Imagen principal de la noticia
		model.addAttribute("texto_noticia", texto.getTextoNoticia());//Texto principal de la noticia
		model.addAttribute("autor_noticia", "Autor de la noticia");//Autor de la noticia
		
		
		/*
		 * Comentarios
		 */
		model.addAttribute("usuario_comentario", "USUARIO DEL COMENTARIO");//Usuario que hizo el comentario
		model.addAttribute("fecha_comentario", "09/02/2019");//Fecha del comentario
		model.addAttribute("texto_comentario", texto.getTextoComentario());//Texto del comentario
		
		
		return "noticia";
	}
	
	@GetMapping("/inicio")
	public String inicio(Model model) {
		
		model.addAttribute("name", "URJC Gaming News");
		model.addAttribute("resources", "/resources");
		
		return "inicio";
	}

}
