package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	@Autowired
	private ArticuloRepository repositorioArticulos;
	
	@GetMapping("/noticia")
	public String noticia(Model model, @RequestParam String title) {

		String nuevoTitulo = title.replace('-',' ');
		List<Articulo> listaArticulos = repositorioArticulos.findByTitulo(nuevoTitulo.toUpperCase());
		Articulo articulo = listaArticulos.get(0);
		List<Comentario> comentarios = articulo.getComments();
			
		/*
		 * Noticia
		 */
		model.addAttribute("titulo_noticia", articulo.getTitulo()); //Titulo de la notica
		model.addAttribute("ruta_imagen_principal","/images/"+articulo.getImagen());//Imagen principal de la noticia
		model.addAttribute("texto_noticia", articulo.getTexto());//Texto principal de la noticia
		model.addAttribute("autor_noticia", articulo.getAutor());//Autor de la noticia
		
		
		/*
		 * Comentarios
		 */
		
		model.addAttribute("listaComentarios",comentarios.toString());
		model.addAttribute("usuario_comentario", "USUARIO DEL COMENTARIO");//Usuario que hizo el comentario
		model.addAttribute("fecha_comentario", "09/02/2019");//Fecha del comentario
		model.addAttribute("texto_comentario", "Polla");//Texto del comentario
		
		
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
