package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

import com.hazelcast.config.Config;

@SpringBootApplication
@EnableHazelcastHttpSession
public class UrjcGamingNewsApplication {

	@Autowired
	//private DatabaseController db;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UrjcGamingNewsApplication.class, args);

	}
	
	
	@Bean
	public Config config() {
		
		Config config = new Config();
		
		
		return config;
	}
	
	@PostConstruct
	public void insertar() {
		//db.InsertarArticulo();
	}

}

