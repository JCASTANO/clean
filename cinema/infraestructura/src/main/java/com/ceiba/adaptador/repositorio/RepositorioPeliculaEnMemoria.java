package com.ceiba.adaptador.repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

@Repository
public class RepositorioPeliculaEnMemoria implements RepositorioPelicula {
	
	private static List<Pelicula> peliculas;

	static {
		peliculas = new ArrayList<>();
		peliculas.add(new Pelicula("batman"));
	}

	@Override
	public List<Pelicula> listar() {
		return getPeliculas();
	}

	@Override
	public void crear(Pelicula pelicula) {
		peliculas.add(pelicula);
	}

	@Override
	public boolean existe(Pelicula pelicula) {
		return getPeliculas().stream().anyMatch(fila -> fila.getNombre().equals(pelicula.getNombre()));
	}
	
	private static List<Pelicula> getPeliculas() {
		return Collections.unmodifiableList(peliculas);
	}
}
