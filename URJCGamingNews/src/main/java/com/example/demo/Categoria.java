package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String categoria;
	
	@OneToMany(mappedBy = "articulo")
    private Set<ArticuloCategoria> employer = new HashSet<ArticuloCategoria>();
	
	protected Categoria() {}
	
	public Categoria(String categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((employer == null) ? 0 : employer.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Categoria other = (Categoria) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (employer == null) {
			if (other.employer != null)
				return false;
		} else if (!employer.equals(other.employer))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
