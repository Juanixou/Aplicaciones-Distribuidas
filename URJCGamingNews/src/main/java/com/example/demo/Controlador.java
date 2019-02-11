package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*
	 * Devuelve la pagina de inicio
	 */
	@GetMapping("/inicio")
	public String inicio(Model model) {
		
		model.addAttribute("name", "URJC Gaming News");
		model.addAttribute("resources", "/resources");
		
		return "inicio";
	}
	
	/*
	 * Devuelve la pagina de las categorias
	 */
	@GetMapping("/categorias")
	public String categorias (Model model) {
		
		return "categorias";
	}
	
	
	/*
	 * Devuelve la pagina de las categoria en concreto
	 */
	@GetMapping("/categoria")
	public String categoria (Model model, @RequestParam String categoria) {
		
		if(categoria.equals("sony")) {//Categoria Sony
			model.addAttribute("ruta_fondo", "('../images/fondos/sony.png')");
			model.addAttribute("categoria", "Sony");
		}
		else if (categoria.equals("xbox")) {//Categoria Xbox
			model.addAttribute("ruta_fondo", "('../images/fondos/xbox.png')");
			model.addAttribute("categoria", "Xbox");
		}
		else if (categoria.equals("nintendo")) {//Categoria Nintendo
			model.addAttribute("ruta_fondo", "('../images/fondos/nintendo.png')");
			model.addAttribute("categoria", "Nintendo");
		}
		else if (categoria.equals("pc")) {//Categoria PC
			model.addAttribute("ruta_fondo", "('../images/fondos/pc.png')");
			model.addAttribute("categoria", "Pc");
		}
		
		return "categoria";
	}
	
	
}
