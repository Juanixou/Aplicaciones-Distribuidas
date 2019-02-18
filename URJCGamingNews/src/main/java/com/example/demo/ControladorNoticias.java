package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
public class ControladorNoticias {

	@Autowired
	private ArticuloRepository repositorioArticulos;
	
	@Autowired
	private ArticuloCategoriaRepository repositorioArticuloCategoria;
	
	@Autowired
	private CategoriaRepository repositorioCategoria;
	
	@GetMapping("/noticia")
	public String noticia(Model model, @RequestParam String title) {

		String nuevoTitulo = title.replace('-',' ');
		List<Articulo> listaArticulos = repositorioArticulos.findByTitulo(nuevoTitulo);
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
		
		model.addAttribute("listaComentarios",comentarios);
		
		return "noticia";
	}
	
	
	
	

	@PostMapping("/checkComentario")
	public String checkNew(Model model, @RequestParam String uname, @RequestParam String email,
			@RequestParam String textoComentario, @RequestParam String titulo) {

		model.addAttribute("uname", uname);
		model.addAttribute("email", email);
		model.addAttribute("titulo", titulo);
		

		model.addAttribute("textoComentario", textoComentario);
		
		 LocalDate localDate = LocalDate.now();

		String nuevoTitulo = titulo.replace('-',' ');
		List<Articulo> listaArticulos = repositorioArticulos.findByTitulo(nuevoTitulo);
		Articulo articulo = listaArticulos.get(0);
		
		articulo.getComments().add(new Comentario(uname,textoComentario,
		 		localDate.toString()));
		repositorioArticulos.save(articulo);
		

		return "checkComentario";
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
	public String categoria (Model model, @RequestParam String[] categoria) {
		String categ = Arrays.toString(categoria);
		categ = categ.substring(1,categ.length()-1);
		System.out.println(categ);
		List<Categoria> listCat = repositorioCategoria.findByCategoria(categ);
		
		List<ArticuloCategoria> listaArticuloCategoria = repositorioArticuloCategoria.findByCategoria(listCat.get(0));
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		
		for(int i = 0; i<listaArticuloCategoria.size();i++) {
			listaArticulos.add(listaArticuloCategoria.get(i).getArticulo());
		}
		
		if(categ.equals("PlayStation")) {//Categoria Sony
			model.addAttribute("ruta_fondo", "('../images/fondos/sony.png')");
			model.addAttribute("categoria", "PlayStation");
		}
		else if (categ.equals("XBOX")) {//Categoria Xbox
			model.addAttribute("ruta_fondo", "('../images/fondos/xbox.png')");
			model.addAttribute("categoria", "XBOX");
		}
		else if (categ.equals("Nintendo")) {//Categoria Nintendo
			model.addAttribute("ruta_fondo", "('../images/fondos/nintendo.png')");
			model.addAttribute("categoria", "Nintendo");
		}
		else if (categ.equals("PC")) {//Categoria PC
			model.addAttribute("ruta_fondo", "('../images/fondos/pc.png')");
			model.addAttribute("categoria", "PC");
		}
		model.addAttribute("listaArticulos",listaArticulos);
		
		return "categoria";
	}
	
	/*
	 * Devuelve la pagina de los distintos tipos de eventos
	 */
	@GetMapping("/eventos")
	public String eventos (Model model) {
		
		return "eventos";
	}
	
	
	/*
	 * Devuelve la pagina de los eventos en concreto
	 */
	@GetMapping("/evento")
	public String evento (Model model, @RequestParam String evento) {
		
		if(evento.equals("videojuegos")) {//Evento de videojuegos
			model.addAttribute("ruta_fondo", "('../images/fondos/eventos/fondo_videojuegos.jpg')");
			model.addAttribute("evento", "Videojuegos");
		}
		else if (evento.equals("conferencias")) {//Evento de conferencias
			model.addAttribute("ruta_fondo", "('../images/fondos/eventos/fondo_conferencias.jpg')");
			model.addAttribute("evento", "Conferencias");
		}
		else if (evento.equals("esports")) {//Evento de E-Sports
			model.addAttribute("ruta_fondo", "('../images/fondos/eventos/fondo_esports.jpg')");
			model.addAttribute("evento", "E-Sports");
		}
		
		return "evento";
	}
	
	
	
}
