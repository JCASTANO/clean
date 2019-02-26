package com.ceiba.servicio;

import com.ceiba.excepcion.ExcepcionDuplicidad;
import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearPelicula {

	private static final String LA_PELICULA_YA_EXISTE_EN_EL_SISTEMA = "La pelicula ya existe en el sistema";
	private RepositorioPelicula repositorioPelicula;
	
	public ServicioCrearPelicula(RepositorioPelicula repositorioPelicula) {
		this.repositorioPelicula = repositorioPelicula;
	}
	
	public void ejecutar(Pelicula pelicula) {
		validarExistenciaPrevia(pelicula);
		this.repositorioPelicula.crear(pelicula);
	}

	private void validarExistenciaPrevia(Pelicula pelicula) {
		boolean existe = this.repositorioPelicula.existe(pelicula);
		if(existe) {
			throw new ExcepcionDuplicidad(LA_PELICULA_YA_EXISTE_EN_EL_SISTEMA);
		}
	}
}
