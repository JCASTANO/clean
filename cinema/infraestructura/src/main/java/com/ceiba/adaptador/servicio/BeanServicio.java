package com.ceiba.adaptador.servicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adaptador.datastore.PeliculaDataStore;
import com.ceiba.adaptador.repositorio.RepositorioPeliculaEnMemoria;
import com.ceiba.servicio.ServicioCrearPelicula;

@Configuration
public class BeanServicio {

	@Bean
	public ServicioCrearPelicula servicioCrearPelicula() {
		return new ServicioCrearPelicula(new RepositorioPeliculaEnMemoria(new PeliculaDataStore()));
	}
}
