package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

	List<Comentario> findByArticuloId(String articuloId);
	
}
