package com.ceiba.adaptador.repositorio;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

@Repository
public class RepositorioPeliculaEnMemoria implements RepositorioPelicula {
	
	private static ConcurrentHashMap<String,Pelicula> peliculas;

	static {
		peliculas = new ConcurrentHashMap<>();
		peliculas.put(UUID.randomUUID().toString(),new Pelicula("batman"));
	}

	@Override
	public Collection<Pelicula> listar() {
		return getPeliculas();
	}

	@Override
	public void crear(Pelicula pelicula) {
		peliculas.put(UUID.randomUUID().toString(),pelicula);
	}

	@Override
	public boolean existe(Pelicula pelicula) {
		return getPeliculas().stream().anyMatch(fila -> fila.getNombre().equals(pelicula.getNombre()));
	}
	
	private static Collection<Pelicula> getPeliculas() {
		return peliculas.values();
	}
}
