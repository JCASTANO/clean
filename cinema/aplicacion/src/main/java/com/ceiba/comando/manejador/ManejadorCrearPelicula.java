package com.ceiba.comando.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.comando.ComandoPelicula;
import com.ceiba.comando.fabrica.FabricaPelicula;
import com.ceiba.modelo.entidad.Pelicula;
import com.ceiba.servicio.ServicioCrearPelicula;

@Component
public class ManejadorCrearPelicula {

	private final ServicioCrearPelicula servicioCrearPelicula;
	private final FabricaPelicula fabricaPelicula;
	
	public ManejadorCrearPelicula(ServicioCrearPelicula servicioCrearPelicula,FabricaPelicula fabricaPelicula) {
		this.servicioCrearPelicula = servicioCrearPelicula;
		this.fabricaPelicula = fabricaPelicula;
	}
	
	public void ejecutar(ComandoPelicula comandoPelicula) {
		Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
		this.servicioCrearPelicula.ejecutar(pelicula);
	}
	
}
