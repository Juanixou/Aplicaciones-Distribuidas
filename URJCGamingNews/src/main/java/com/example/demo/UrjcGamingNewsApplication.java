package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrjcGamingNewsApplication {

	@Autowired
	private DatabaseController db;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UrjcGamingNewsApplication.class, args);

	}
	
	@PostConstruct
	public void insertar() {
		db.InsertarArticulo();
	}

}

