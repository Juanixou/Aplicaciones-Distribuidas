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
	private ArticuloRepository repositorioArticulos;
	
	@GetMapping("")
	 public String greeting(Model model) {
		db.InsertarArticulo();		

		model.addAttribute("name", "URJC Gaming News");
		model.addAttribute("nameSlider1","Kingdom Hearts III");
		model.addAttribute("textSlider1","Trás muchos años de espera, al fin está aquí el tan esperado Kingdom Hearts III, y desde URJC Gaming News, os traemos toda la información sobre el juego.");
		model.addAttribute("imageSlider1","images/kh3.jpg");
		
		/*
		List<Articulo> listaArticulos = repositorioArticulos.findAll();
		Articulo art = listaArticulos.get(0);
		String titulo = art.getTitulo();
		titulo.replace('-',' ');
			*/
		
		
		model.addAttribute("nameSlider2","Red Dead Redemption 2");
		model.addAttribute("textSlider2","Os traemos toda la información acerca del nuevo Red Dead Redemption 2, la secuela del exitoso Red Dead. Seguid con nosotros la información de este increible juego y cabalgad a lo largo y ancho del oeste como un pistolero.");
		model.addAttribute("imageSlider2","images/RDR2.png");
		
		model.addAttribute("nameSlider3","Uncharted 4: El Desenlace del Ladrón");
		model.addAttribute("textSlider3","La exitosa saga de videojuegos Uncharted llega a su fin. Nathan Drake deberá decidir si está realmente dispuesto a sacrificarse por salvar a sus seres queridos, o si por el contrario, solo buscará fama, gloria y fortuna...");
		model.addAttribute("imageSlider3","images/U4.jpg");
		
		model.addAttribute("noticiasFrescasName1","Kingdom Hearts III");
		model.addAttribute("noticiasFrescasImage1","images/kh3.jpg");
		
		model.addAttribute("noticiasFrescasName2","Red Dead Redemption 2");
		model.addAttribute("noticiasFrescasImage2","images/RDR2.png");
		
		model.addAttribute("noticiasFrescasName3","Uncharted 4: El desenlace del Ladrón");
		model.addAttribute("noticiasFrescasImage3","images/U4.jpg");
		
		model.addAttribute("resources", "/resources");

		return "inicio";
	 }

}
