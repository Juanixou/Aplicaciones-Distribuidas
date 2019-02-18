package com.example.demo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ArticuloCategoria {

	@EmbeddedId
	private ArticuloCategoriaPK id = new ArticuloCategoriaPK();
	
	@ManyToOne
	@MapsId("id_articulo") //This is the name of attr in ArticuloCategoriaPK class
	@JoinColumn(name = "id_articulo",insertable = false)
	private Articulo articulo;
	
	@ManyToOne
	@MapsId("id_categoria") //This is the name of attr in ArticuloCategoriaPK class
	@JoinColumn(name = "id_categoria",insertable = false)
	private Categoria categoria;
	
	protected ArticuloCategoria() {}

	public ArticuloCategoriaPK getId() {
		return id;
	}

	public void setId(ArticuloCategoriaPK id) {
		this.id = id;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
