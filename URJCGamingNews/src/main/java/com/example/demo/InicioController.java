package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InicioController {

	@Autowired
	private DatabaseController db;
	@Autowired
	private ArticuloRepository repositorioArticulos;
	
	@GetMapping("")
	 public String greeting(Model model) {
		db.InsertarArticulo();		

		List<Articulo> listaArticulosSlider = repositorioArticulos.findFirst3ByOrderByFechaDesc();
		List<Articulo> listaArticulos = repositorioArticulos.findAllByOrderByFechaDesc();
		
		model.addAttribute("name","URJC Gaming News");
		
		/*Gestion de noticias del Slider*/
		model.addAttribute("noticiasSlider",listaArticulosSlider);
		/*Gestión de la lista de noticias publicadas*/
		model.addAttribute("listaTotalArticulos",listaArticulos);
		model.addAttribute("resources", "/resources");

		return "inicio";
	 }

}
