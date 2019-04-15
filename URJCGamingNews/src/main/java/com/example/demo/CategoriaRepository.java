package com.example.demo;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames="BD")
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	@CacheEvict(allEntries=true)
	<Cat extends Categoria> Cat save(Categoria articulo);
	
	@Cacheable
	List<Categoria> findById(long id);
	@Cacheable
	List<Categoria> findByCategoria(String categoria);
	@Cacheable
	List<Categoria> findAllByOrderByIdAsc();
	
}
