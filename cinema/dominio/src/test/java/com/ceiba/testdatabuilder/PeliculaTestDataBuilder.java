package com.ceiba.testdatabuilder;

import com.ceiba.modelo.entidad.Pelicula;

public class PeliculaTestDataBuilder {

	private String nombre;
	private String genero;
	private Long anioEstreno;
	
	
	public PeliculaTestDataBuilder() {
		this.nombre = "Batman";
		this.genero = "Comedia";
		this.anioEstreno = 2018L;
	}
	
	public PeliculaTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public PeliculaTestDataBuilder conGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(nombre,genero,anioEstreno);
	}
}
