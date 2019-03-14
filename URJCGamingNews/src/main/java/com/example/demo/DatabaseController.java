package com.example.demo;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DatabaseController{
	
	 @Autowired
	 private  ArticuloRepository artic;
	 
	 @Autowired
	 private  ComentarioRepository coment;
	 
		@Autowired
		private CategoriaRepository repositorioCategorias;
		
	@Autowired
	private ArticuloCategoriaRepository repositorioArticuloCategoria;
	 
	 public void InsertarArticulo(){

		 LocalDate localDate = LocalDate.now();
		 /*
		 Articulo articulo = new Articulo("UNCHARTED 4","LLega el tan esperado Uncharted 4","Take-Two supera sus expectativas de ingresos durante este tercer trimestre gracias al título de Rockstar; el juego previo vendió 15 millones. Take-Two Interactive ha publicado los resultados financieros de este pasado trimestre finalizado el 31 de diciembre."
					+ " La gigante americana ha superado con creces sus expectativas en el balance de ingresos,"
					+ " unos beneficios netos conducidos principalmente por el impresionante éxito de Red Dead Redemption 2,"
					+ " que ha vendido ya más de 23 millones de unidades."
					+ " De acuerdo con los registros oficiales adelantados por el grupo analista Niko Partners,"
					+ " el videojuego protagonizado por Arthur Morgan —cuyo análisis podéis leer aquí— ha superado ya"
					+ " los 15 millones de copias vendidas por el juego original de la pasada generación en todo el mundo"
					+ " y está destinado a multiplicar sus registros en cuestión de meses.",
					"U4.jpg","2019-02-12","Juan Pedro Guirado");
			
		 articulo.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
		 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
		 		localDate.toString()));
		 articulo.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
			 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
			 		localDate.toString()));
		 artic.save(articulo);
		 
		 Articulo articulo2 = new Articulo("RED DEAD REDEMPTION 2","LLega el tan esperado Red Dead 2","Take-Two supera sus expectativas de ingresos durante este tercer trimestre gracias al título de Rockstar; el juego previo vendió 15 millones. Take-Two Interactive ha publicado los resultados financieros de este pasado trimestre finalizado el 31 de diciembre."
					+ " La gigante americana ha superado con creces sus expectativas en el balance de ingresos,"
					+ " unos beneficios netos conducidos principalmente por el impresionante éxito de Red Dead Redemption 2,"
					+ " que ha vendido ya más de 23 millones de unidades."
					+ " De acuerdo con los registros oficiales adelantados por el grupo analista Niko Partners,"
					+ " el videojuego protagonizado por Arthur Morgan —cuyo análisis podéis leer aquí— ha superado ya"
					+ " los 15 millones de copias vendidas por el juego original de la pasada generación en todo el mundo"
					+ " y está destinado a multiplicar sus registros en cuestión de meses.",
					"RDR2.png","2018-02-14","Juan Pedro Guirado");
			
		 articulo2.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
		 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
		 		localDate.toString()));
		 articulo2.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
			 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
			 		localDate.toString()));
		 artic.save(articulo2);
		 
		 Articulo articulo3 = new Articulo("KINGDOM HEARTS 3","LLega el tan esperado Kingdom Hearts 3","Take-Two supera sus expectativas de ingresos durante este tercer trimestre gracias al título de Rockstar; el juego previo vendió 15 millones. Take-Two Interactive ha publicado los resultados financieros de este pasado trimestre finalizado el 31 de diciembre."
					+ " La gigante americana ha superado con creces sus expectativas en el balance de ingresos,"
					+ " unos beneficios netos conducidos principalmente por el impresionante éxito de Red Dead Redemption 2,"
					+ " que ha vendido ya más de 23 millones de unidades."
					+ " De acuerdo con los registros oficiales adelantados por el grupo analista Niko Partners,"
					+ " el videojuego protagonizado por Arthur Morgan —cuyo análisis podéis leer aquí— ha superado ya"
					+ " los 15 millones de copias vendidas por el juego original de la pasada generación en todo el mundo"
					+ " y está destinado a multiplicar sus registros en cuestión de meses.",
					"kh3.jpg",localDate.toString(),"Juan Pedro Guirado");
			
		 articulo3.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
		 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
		 		localDate.toString()));
		 articulo3.getComments().add(new Comentario("Juanixou","Veo por aquí mucha gente que le aburre el juego, que si mucho caballo, que si es lento, si es cierto pero, no se que se esperaban, el contexto es el que es, la época no da para más, no os entiendo, no puede haber coches, no puede haber metrópolis, ni ametralladoras o granadas."
			 		+ " El juego es una delicia para saborearlo tranquilamente, cada juego tiene un ritmo. El primer RDR era as",
			 		localDate.toString()));
		 artic.save(articulo3);
		 
		 Categoria categoria1 = new Categoria("PC");
		 Categoria categoria2 = new Categoria("PlayStation");
		 Categoria categoria3 = new Categoria("XBOX");
		 Categoria categoria4 = new Categoria("Nintendo");
		 Categoria categoria5 = new Categoria("videojuegos");
		 Categoria categoria6 = new Categoria("conferencias");
		 Categoria categoria7 = new Categoria("esports");
		 repositorioCategorias.save(categoria1);
		 repositorioCategorias.save(categoria2);
		 repositorioCategorias.save(categoria3);
		 repositorioCategorias.save(categoria4);
		 repositorioCategorias.save(categoria5);
		 repositorioCategorias.save(categoria6);
		 repositorioCategorias.save(categoria7);

		 
		 ArticuloCategoria artCat = new ArticuloCategoria();
		artCat.setArticulo(articulo);
		artCat.setCategoria(categoria2);
		repositorioArticuloCategoria.save(artCat);
		artCat = new ArticuloCategoria();
		artCat.setArticulo(articulo2);
		artCat.setCategoria(categoria2);
		repositorioArticuloCategoria.save(artCat);
		artCat = new ArticuloCategoria();
		artCat.setArticulo(articulo3);
		artCat.setCategoria(categoria2);
		repositorioArticuloCategoria.save(artCat);
		
*/
		 
	 }
	 
}

