package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

	List<Articulo> findByTitulo(String titulo);
	List<Articulo> findAll();
	List<Articulo> findFirst3ByOrderByFechaDesc();
	List<Articulo> findAllByOrderByFechaDesc();
	}

