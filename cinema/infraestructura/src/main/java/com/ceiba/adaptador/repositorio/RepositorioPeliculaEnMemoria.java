package com.ceiba.adaptador.repositorio;

import org.springframework.stereotype.Repository;

import com.ceiba.adaptador.datastore.PeliculaDataStore;
import com.ceiba.modelo.entidad.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

@Repository
public class RepositorioPeliculaEnMemoria implements RepositorioPelicula {
	
	/**
	 * Solo se debe usar data store para pruebas en un contexto real deberia usar una bd
	 *
	 */
	private final PeliculaDataStore peliculaDataStore;
	
	public RepositorioPeliculaEnMemoria(PeliculaDataStore peliculaDataStore) {
		this.peliculaDataStore = peliculaDataStore;
	}

	@Override
	public void crear(Pelicula pelicula) {
		peliculaDataStore.put(pelicula);
	}

	@Override
	public boolean existe(Pelicula pelicula) {
		return peliculaDataStore.get().stream().anyMatch(fila -> fila.getNombre().equals(pelicula.getNombre()));
	}
}
