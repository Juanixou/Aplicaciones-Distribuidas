package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArticuloCategoriaPK implements Serializable {


	@Column(name = "id_articulo")
    private long id_articulo;

     @Column(name = "id_categoria")
    private long id_categoria;

	public long getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(long id_articulo) {
		this.id_articulo = id_articulo;
	}

	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
}
