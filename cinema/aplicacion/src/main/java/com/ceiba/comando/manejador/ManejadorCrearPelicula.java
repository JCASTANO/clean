package com.ceiba.comando.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.comando.ComandoPelicula;
import com.ceiba.modelo.Pelicula;
import com.ceiba.servicio.ServicioCrearPelicula;

@Component
public class ManejadorCrearPelicula {

	private final ServicioCrearPelicula servicioCrearPelicula;
	
	public ManejadorCrearPelicula(ServicioCrearPelicula servicioCrearPelicula) {
		this.servicioCrearPelicula = servicioCrearPelicula;
	}
	
	public void ejecutar(ComandoPelicula comandoPelicula) {
		this.servicioCrearPelicula.ejecutar(new Pelicula(comandoPelicula.getNombre()));
	}
}
