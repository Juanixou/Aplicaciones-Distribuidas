package com.example.demo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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



}
