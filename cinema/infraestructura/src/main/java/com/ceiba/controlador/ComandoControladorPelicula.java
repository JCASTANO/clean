package com.ceiba.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.comando.ComandoPelicula;
import com.ceiba.comando.manejador.ManejadorCrearPelicula;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/privada/peliculas")
@Api(tags = { "Controlador pelicula"})
public class ComandoControladorPelicula {

	private final ManejadorCrearPelicula manejadorCrearPelicula;
	
	public ComandoControladorPelicula(ManejadorCrearPelicula manejadorCrearPelicula) {
		this.manejadorCrearPelicula = manejadorCrearPelicula;
	}
	
	@PostMapping
	@ApiOperation("crear")
	public void crear(@RequestBody ComandoPelicula comandoUsuario) {
		this.manejadorCrearPelicula.ejecutar(comandoUsuario);
	}
}
