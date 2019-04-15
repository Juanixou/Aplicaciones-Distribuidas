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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_articulo ^ (id_articulo >>> 32));
		result = prime * result + (int) (id_categoria ^ (id_categoria >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticuloCategoriaPK other = (ArticuloCategoriaPK) obj;
		if (id_articulo != other.id_articulo)
			return false;
		if (id_categoria != other.id_categoria)
			return false;
		return true;
	}
	
	
	
}
