package com.ceiba.modelo;

public class Pelicula {

	private static final int TAMANO_MINIMO_NOMBRE = 4;
	private static final String EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS = "El nombre debe tener mínimo %s letras.";
	private static final String EL_NOMBRE_ES_UN_DATO_OBLIGATORIO = "El nombre es un dato obligatorio.";
	
	private String nombre;
	
	public Pelicula(String nombre) {
		ValidadorArgumento.validarObligatorio(nombre, EL_NOMBRE_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarLongitud(nombre, TAMANO_MINIMO_NOMBRE, String.format(EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS,TAMANO_MINIMO_NOMBRE));
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
