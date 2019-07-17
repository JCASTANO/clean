package com.ceiba.testdatabuilder;

import com.ceiba.comando.ComandoPelicula;

public class ComandoPeliculaTestDataBuilder {

	private String nombre;
	private String genero;
	private Long anioEstreno;
	
	public ComandoPeliculaTestDataBuilder() {
		this.nombre = "Batman";
		this.genero = "comedia";
		this.anioEstreno = 2018L;
	}
	
	public ComandoPeliculaTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoPelicula build() {
		return new ComandoPelicula(nombre,genero,anioEstreno);
	}
}
