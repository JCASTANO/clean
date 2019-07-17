package com.ceiba.modelo.entidad;

public class Pelicula {

	private static final int TAMANO_MINIMO_NOMBRE = 4;
	private static final String EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS = "El nombre debe tener mínimo %s letras.";
	private static final String EL_NOMBRE_ES_UN_DATO_OBLIGATORIO = "El nombre es un dato obligatorio.";
	private static final String EL_GENERO_ES_UN_DATO_OBLIGATORIO = "El genero es un dato obligatorio.";
	private static final String EL_ANIO_ESTRENO_ES_UN_DATO_OBLIGATORIO = "El anio de estreno es un dato obligatorio.";
	
	private String nombre;
	private String genero;
	private Long anioEstreno;
	
	public Pelicula(String nombre,String genero,Long anioEstreno) {
		ValidadorArgumento.validarObligatorio(nombre, EL_NOMBRE_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarLongitud(nombre, TAMANO_MINIMO_NOMBRE, String.format(EL_NOMBRE_DEBE_TENER_MINIMO_LETRAS,TAMANO_MINIMO_NOMBRE));
		ValidadorArgumento.validarObligatorio(genero, EL_GENERO_ES_UN_DATO_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(anioEstreno, EL_ANIO_ESTRENO_ES_UN_DATO_OBLIGATORIO);
		
		this.nombre = nombre;
		this.genero = genero;
		this.anioEstreno = anioEstreno;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public Long getAnioEstreno() {
		return anioEstreno;
	}
}
