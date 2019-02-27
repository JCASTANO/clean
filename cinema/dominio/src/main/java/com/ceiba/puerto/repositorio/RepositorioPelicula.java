package com.ceiba.puerto.repositorio;

import java.util.Collection;

import com.ceiba.modelo.Pelicula;

public interface RepositorioPelicula {

	/**
	 * Permite listar las peliculas
	 * @return
	 */
	Collection<Pelicula> listar();
	
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
