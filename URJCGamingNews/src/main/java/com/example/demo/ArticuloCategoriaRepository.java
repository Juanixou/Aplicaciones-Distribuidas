package com.example.demo;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames="BD")
public interface ArticuloCategoriaRepository extends JpaRepository<ArticuloCategoria, ArticuloCategoriaPK>{

	@CacheEvict(allEntries=true)
	ArticuloCategoria save(ArticuloCategoria articulo);
	
	@Cacheable
	List<ArticuloCategoria> findByCategoria(Categoria categoria);
	
}
