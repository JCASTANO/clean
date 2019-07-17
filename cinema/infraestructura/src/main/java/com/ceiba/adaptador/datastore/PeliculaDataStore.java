package com.ceiba.adaptador.datastore;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ceiba.modelo.dto.DtoPelicula;
import com.ceiba.modelo.entidad.Pelicula;

/**
 * Solo se debe usar data store para pruebas en un contexto real deberia usar una bd
 *
 */
@Component
public class PeliculaDataStore {

	private static ConcurrentHashMap<String,Pelicula> peliculas;

	static {
		peliculas = new ConcurrentHashMap<>();
		peliculas.put(UUID.randomUUID().toString(),new Pelicula("batman","comedia",2018L));
	}
	
	public Collection<Pelicula> get() {
		return peliculas.values();
	}
	
	public Collection<DtoPelicula> getAsDto() {
		return peliculas.values().stream()
				  				 .map(pelicula -> new DtoPelicula(pelicula.getNombre()))
				  				 .collect(Collectors.toList());
	}
	
	public void put(Pelicula pelicula) {
		peliculas.put(UUID.randomUUID().toString(), pelicula);
	}
}
