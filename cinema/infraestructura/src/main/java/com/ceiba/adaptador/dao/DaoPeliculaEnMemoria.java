package com.ceiba.adaptador.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.ceiba.adaptador.datastore.PeliculaDataStore;
import com.ceiba.modelo.dto.DtoPelicula;
import com.ceiba.puerto.dao.DaoPelicula;

@Repository
public class DaoPeliculaEnMemoria implements DaoPelicula {
	
	/**
	 * Solo se debe usar data store para pruebas en un contexto real deberia usar una bd
	 *
	 */
	private final PeliculaDataStore peliculaDataStore;
	
	public DaoPeliculaEnMemoria(PeliculaDataStore peliculaDataStore) {
		this.peliculaDataStore = peliculaDataStore;
	}

	@Override
	public Collection<DtoPelicula> listar() {
		return peliculaDataStore.getAsDto();
	}
}
