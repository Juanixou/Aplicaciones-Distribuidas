package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDate;
import java.util.ArrayList;
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
	private ArticuloRepository artic;

	@Autowired
	private ArticuloCategoriaRepository repositorioArticuloCategoria;

	@Autowired
	private CategoriaRepository repositorioCategoria;
	
	@Autowired
	private NewsletterRepository repositorioNewsletter;

	@GetMapping("/escribirNoticia")
	public String escribirNoticia(Model mod3el) {

		return "escribirNoticia";
	}

	@PostMapping("/checkNew")
	public String checkNew(Model model, @RequestParam String uname, @RequestParam String titulo, String subirImagen,
			@RequestParam String textoNoticia, @RequestParam String descripcion,
			@RequestParam(value = "categoria", required = false) String[] checkboxValue) {

		/*
		 * @RequestParam(value = "categoria1", required = false) String
		 * checkboxValue1,@RequestParam(value = "categoria2", required = false) String
		 * checkboxValue2,
		 * 
		 * @RequestParam(value = "categoria3", required = false) String
		 * checkboxValue3,@RequestParam(value = "categoria4", required = false) String
		 * checkboxValue4
		 */

		model.addAttribute("uname", uname);
		model.addAttribute("titulo", titulo);
		model.addAttribute("descripcion", descripcion);
		model.addAttribute("subirImagen", subirImagen);
		model.addAttribute("textoNoticia", textoNoticia);

		LocalDate localDate = LocalDate.now();

		Articulo articulo = new Articulo(titulo, descripcion, textoNoticia, "placeholder.jpg", localDate.toString(),
				uname);
		artic.save(articulo);
		List<Categoria> listaCategorias = repositorioCategoria.findAllByOrderByIdAsc();
		for (int i = 0; i < checkboxValue.length; i++) {
			if (checkboxValue[i] != null) {
				ArticuloCategoria artCat = new ArticuloCategoria();
				artCat.setArticulo(articulo);
				artCat.setCategoria(listaCategorias.get(Integer.parseInt(checkboxValue[i])));
				repositorioArticuloCategoria.save(artCat);
			}

		}

		// Enviar e-mails a todos los subscritos de que se ha subido una nueva noticia

		String linkNoticia = "https://127.0.0.1:8443/noticia?title=" + titulo.replace(' ', '-');
		
		//Sustituir email1, email2 y los add de la lista de correos por TODOS los correos newsletter de la BD.

		int numeroPuerto = 7777;

		// Almacena todos los correos en una lista
		List<Newsletter> listaCorreos = repositorioNewsletter.findAllByOrderByIdAsc();


		try {
			Socket socket = new Socket(InetAddress.getLocalHost(), numeroPuerto);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

			// Envía en primer lugar el link de la noticia y después todos los correos
			for (int i = 0; i <= listaCorreos.size(); i++) {

				if (i == 0)
					pw.println(linkNoticia);
				else
					pw.println(listaCorreos.get(i - 1).getEmail());
			}

			br.close();
			pw.close();
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "checkNew";
	}

}
