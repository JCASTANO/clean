package com.ceiba.consulta.manejador;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

@Component
public class ManejadorListarPeliculas {

	private final RepositorioPelicula repositorioPelicula;
	
	public ManejadorListarPeliculas(RepositorioPelicula daoPelicula) {
		this.repositorioPelicula = daoPelicula;
	}
	
	public List<Pelicula> ejecutar() {
		return this.repositorioPelicula.listar();
	}
}
