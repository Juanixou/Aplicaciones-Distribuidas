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
	private ArticuloCategoriaPK id;
	
	@ManyToOne
	@MapsId("id_articulo") //This is the name of attr in EmployerDeliveryAgentPK class
	@JoinColumn(name = "id_articulo")
	private Articulo articulo;
	
	@ManyToOne
	@MapsId("id_categoria") //This is the name of attr in EmployerDeliveryAgentPK class
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	protected ArticuloCategoria() {}

	
}
