package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String user;
	@Lob
	private String comentario;
	private String fecha;
	
	@ManyToOne
	private Articulo articulo;

	protected Comentario() {}
	
	public Comentario(String user, String comentario, String fecha) {
		this.user = user;
		this.comentario = comentario;
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", user=" + user + ", comentario=" + comentario + ", fecha=" + fecha
				+ ", articulo=" + articulo + "]";
	}
}
