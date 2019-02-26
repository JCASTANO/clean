package com.ceiba.testdatabuilder;

import com.ceiba.modelo.Pelicula;

public class PeliculaTestDataBuilder {

	private String nombre;
	
	public PeliculaTestDataBuilder() {
		this.nombre = "Batman";
	}
	
	public PeliculaTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(nombre);
	}
}
