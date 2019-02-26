package com.ceiba.testdatabuilder;

import com.ceiba.comando.ComandoPelicula;

public class ComandoPeliculaTestDataBuilder {

	private String nombre;
	
	public ComandoPeliculaTestDataBuilder() {
		this.nombre = "Batman";
	}
	
	public ComandoPeliculaTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ComandoPelicula build() {
		return new ComandoPelicula(nombre);
	}
}
