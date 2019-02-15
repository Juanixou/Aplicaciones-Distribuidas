package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArticuloCategoriaPK implements Serializable {

    @Column(name = "id_articulo")
    private Long id_articulo;

     @Column(name = "id_categoria")
    private Long id_categoria;
	
	
}
