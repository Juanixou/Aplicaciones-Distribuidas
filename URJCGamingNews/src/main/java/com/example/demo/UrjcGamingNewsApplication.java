package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

import com.hazelcast.config.Config;

@EnableCaching
@SpringBootApplication
@EnableHazelcastHttpSession
public class UrjcGamingNewsApplication {

	@Autowired
	//private DatabaseController db;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UrjcGamingNewsApplication.class, args);

	}
	
    @Bean
    public CacheManager cacheManager() {
    	System.out.println("Activating cache...");
    	return new ConcurrentMapCacheManager("BD");
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

