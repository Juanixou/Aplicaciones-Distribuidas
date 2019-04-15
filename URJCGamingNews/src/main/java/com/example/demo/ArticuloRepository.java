package com.example.demo;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames="BD")
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

	@CacheEvict(allEntries=true)
	<Art extends Articulo> Art save(Articulo articulo);
	
	@Cacheable
	List<Articulo> findByTitulo(String titulo);
	@Cacheable
	List<Articulo> findAll();
	@Cacheable
	List<Articulo> findFirst3ByOrderByFechaDesc();
	@Cacheable
	List<Articulo> findAllByOrderByFechaDesc();
	}

