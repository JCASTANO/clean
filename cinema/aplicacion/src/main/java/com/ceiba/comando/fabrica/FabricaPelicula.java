package com.ceiba.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.comando.ComandoPelicula;
import com.ceiba.modelo.entidad.Pelicula;

@Component
public class FabricaPelicula {

	public Pelicula crear(ComandoPelicula comandoPelicula) {
		return new Pelicula(comandoPelicula.getNombre(),comandoPelicula.getGenero(),comandoPelicula.getAnioEstreno());
	}
}
