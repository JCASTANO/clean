package com.ceiba.servicio;

import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.BasePrueba;
import com.ceiba.excepcion.ExcepcionDuplicidad;
import com.ceiba.modelo.Pelicula;
import com.ceiba.puerto.repositorio.RepositorioPelicula;
import com.ceiba.testdatabuilder.PeliculaTestDataBuilder;

public class ServicioCrearPeliculaTest {

	@Test
	public void validarExistenciaPrevia() {
		//Arrange
		Pelicula pelicula = new PeliculaTestDataBuilder().build();
		RepositorioPelicula repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
		Mockito.when(repositorioPelicula.existe(Mockito.any())).thenReturn(true);
		//Act
		ServicioCrearPelicula servicioCrearPelicula = new ServicioCrearPelicula(repositorioPelicula);
		//Assert
		BasePrueba.assertThrows(() -> servicioCrearPelicula.ejecutar(pelicula), ExcepcionDuplicidad.class,"La pelicula ya existe en el sistema");
	}
}
