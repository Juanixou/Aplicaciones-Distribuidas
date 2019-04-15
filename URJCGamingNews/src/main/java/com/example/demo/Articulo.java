package com.example.demo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String titulo;
	private String descripcion;
	@Lob
	private String texto;
	private String imagen;
	private String fecha;
	private String autor;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Comentario> comments = new ArrayList<Comentario>();
	
	@OneToMany(mappedBy = "categoria")
    private Set<ArticuloCategoria> employerDeliveryAgent = new HashSet<ArticuloCategoria>();

	protected Articulo() {}
	
	public Articulo(String tit, String des, String tex, String img, String fecha, String autor) {
		this.titulo = tit;
		this.descripcion = des;
		this.texto = tex;
		this.imagen = img;
		this.fecha = fecha;
		this.autor = autor;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public List<Comentario> getComments() {
		return comments;
	}

	public void setComments(List<Comentario> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", texto=" + texto
				+ ", imagen=" + imagen + ", fecha=" + fecha + ", autor=" + autor + ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((employerDeliveryAgent == null) ? 0 : employerDeliveryAgent.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Articulo other = (Articulo) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (employerDeliveryAgent == null) {
			if (other.employerDeliveryAgent != null)
				return false;
		} else if (!employerDeliveryAgent.equals(other.employerDeliveryAgent))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}



}
