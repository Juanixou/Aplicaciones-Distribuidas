package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String titulo;
	private String descripcion;
	private String texto;
	private String imagen;
	
	protected Articulo() {}
	
	public Articulo(String tit, String des, String tex, String img) {
		this.titulo = tit;
		this.descripcion = des;
		this.texto = tex;
		this.imagen = img;
	}
}
