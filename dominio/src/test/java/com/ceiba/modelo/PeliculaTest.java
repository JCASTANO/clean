package com.ceiba.modelo;

import org.junit.Test;

import com.ceiba.BasePrueba;
import com.ceiba.excepcion.ExcepcionLongitudValor;
import com.ceiba.excepcion.ExcepcionValorObligatorio;
import com.ceiba.testdatabuilder.PeliculaTestDataBuilder;

public class PeliculaTest {

	@Test
	public void validarNombreObligatorio() {
		//Arrange
		PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();
		peliculaTestDataBuilder.conNombre(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> peliculaTestDataBuilder.build(),ExcepcionValorObligatorio.class,"El nombre es un dato obligatorio.");
	}
	
	@Test
	public void validarNombreCorto() {
		//Arrange
		PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();
		peliculaTestDataBuilder.conNombre("abc");
		//Act - Assert
		BasePrueba.assertThrows(() -> peliculaTestDataBuilder.build(),ExcepcionLongitudValor.class,"El nombre debe tener mínimo 4 letras.");
	}
}
