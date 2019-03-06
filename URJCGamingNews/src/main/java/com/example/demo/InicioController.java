package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
	
	@GetMapping("/email")
	public String enviarEmail(Model model) {
		
		
		int numeroPuerto = 7777;
		String email = "juanpe1997@hotmail.com";
		
		try {
			Socket socket = new Socket(InetAddress.getLocalHost(),numeroPuerto);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			
			pw.println(email);
			
			br.close();
			pw.close();
			socket.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return "email";
	 }
}
