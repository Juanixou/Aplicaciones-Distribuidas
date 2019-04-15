package com.example.demo;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames="BD")
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

	@CacheEvict(allEntries=true)
	<Com extends Comentario> Com save(Comentario articulo);
	
	@Cacheable
	List<Comentario> findByArticuloId(String articuloId);
	
}
