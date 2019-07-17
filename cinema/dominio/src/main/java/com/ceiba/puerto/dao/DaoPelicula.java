package com.ceiba.puerto.dao;

import java.util.Collection;

import com.ceiba.modelo.dto.DtoPelicula;

public interface DaoPelicula {

	/**
	 * Permite listar las peliculas
	 * @return
	 */
	Collection<DtoPelicula> listar();
}
