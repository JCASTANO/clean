package com.ceiba.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.comando.ComandoPelicula;
import com.ceiba.comando.manejador.ManejadorCrearPelicula;
import com.ceiba.consulta.manejador.ManejadorListarPeliculas;
import com.ceiba.modelo.Pelicula;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/peliculas")
@Api(tags = { "Controlador pelicula"})
public class ControladorPelicula {
	
	private final ManejadorListarPeliculas manejadorListarPeliculas;
	private final ManejadorCrearPelicula manejadorCrearPelicula;
	
	public ControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas,ManejadorCrearPelicula manejadorCrearPelicula) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
		this.manejadorCrearPelicula = manejadorCrearPelicula;
	}

	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation("listar")
	public List<Pelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}
	
	@PostMapping
	@ApiOperation("crear")
	public void crear(@RequestBody ComandoPelicula comandoUsuario) {
		this.manejadorCrearPelicula.ejecutar(comandoUsuario);
	}
}
