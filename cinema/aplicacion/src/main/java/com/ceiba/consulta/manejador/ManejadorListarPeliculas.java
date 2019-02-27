package com.ceiba.consulta.manejador;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

@Component
public class ManejadorListarPeliculas {

	private final RepositorioPelicula repositorioPelicula;
	
	public ManejadorListarPeliculas(RepositorioPelicula daoPelicula) {
		this.repositorioPelicula = daoPelicula;
	}
	
	public Collection<Pelicula> ejecutar() {
		return this.repositorioPelicula.listar();
	}
}
