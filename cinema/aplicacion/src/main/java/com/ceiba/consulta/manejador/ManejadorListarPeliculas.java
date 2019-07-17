package com.ceiba.consulta.manejador;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.ceiba.modelo.dto.DtoPelicula;
import com.ceiba.puerto.dao.DaoPelicula;

@Component
public class ManejadorListarPeliculas {

	private final DaoPelicula daoPelicula;
	
	public ManejadorListarPeliculas(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	public Collection<DtoPelicula> ejecutar() {
		return this.daoPelicula.listar();
	}
}
