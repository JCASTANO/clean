package com.ceiba.puerto.repositorio;

import com.ceiba.modelo.entidad.Pelicula;

public interface RepositorioPelicula {
	
	/**
	 * Permite crear las peliculas
	 * @param pelicula
	 */
	void crear(Pelicula pelicula);
	
	/**
	 * Permite determinar si previamente se registro la pelicula
	 * @param pelicula
	 * @return si existe o no
	 */
	boolean existe(Pelicula pelicula);
}
