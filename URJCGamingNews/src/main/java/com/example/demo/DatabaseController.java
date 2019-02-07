package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DatabaseController{
	
	 @Autowired
	 private  ArticuloRepository artic;
	 
	 public void InsertarArticulo(){
			artic.save(new Articulo("Kingdom Hearts III","Por fin el juego","Esta es la descripcion super chula del articulo que esta guapo que te cagas",
					"kh3.jpg"));
	 }
	 
	 public void SacarArticulo() {
		 
	 }
	 
}

