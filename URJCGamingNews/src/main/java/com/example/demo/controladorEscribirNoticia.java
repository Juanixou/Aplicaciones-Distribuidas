package com.example.demo;

import java.time.LocalDate;
import java.util.List;

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
	 
	 @Autowired
	 private ArticuloCategoriaRepository repositorioArticuloCategoria;
	 
	 @Autowired
	 private CategoriaRepository repositorioCategoria;
	 

	@GetMapping("/escribirNoticia")
	public String escribirNoticia (Model mod3el) {
		
		return "escribirNoticia";
	}
	
	
	
	@PostMapping("/checkNew")
	public String checkNew(Model model, @RequestParam String uname, @RequestParam String titulo,
			String subirImagen,@RequestParam String textoNoticia, @RequestParam String descripcion,
			@RequestParam(value = "categoria", required = false) String[] checkboxValue) {

		/*
		 * @RequestParam(value = "categoria1", required = false) String checkboxValue1,@RequestParam(value = "categoria2", required = false) String checkboxValue2,
			@RequestParam(value = "categoria3", required = false) String checkboxValue3,@RequestParam(value = "categoria4", required = false) String checkboxValue4
		 */
		
		model.addAttribute("uname", uname);
		model.addAttribute("titulo", titulo);
		model.addAttribute("descripcion", descripcion);
		model.addAttribute("subirImagen",subirImagen);
		model.addAttribute("textoNoticia", textoNoticia);
		
		
		LocalDate localDate = LocalDate.now();
		 
		Articulo articulo = new Articulo(titulo,descripcion,textoNoticia,
					"placeholder.jpg",localDate.toString(),uname);
		artic.save(articulo);
		List<Categoria> listaCategorias = repositorioCategoria.findAllByOrderByIdAsc();
		for(int i=0;i<checkboxValue.length;i++) {
			if(checkboxValue[i]!=null) {
				ArticuloCategoria artCat = new ArticuloCategoria();
				artCat.setArticulo(articulo);
				artCat.setCategoria(listaCategorias.get(Integer.parseInt(checkboxValue[i])));
				repositorioArticuloCategoria.save(artCat);
			}

		}

		


		return "checkNew";
	}

}
