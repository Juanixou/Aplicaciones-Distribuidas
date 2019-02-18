package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List<Categoria> findById(long id);
	List<Categoria> findByCategoria(String categoria);
	List<Categoria> findAllByOrderByIdAsc();
	
}
