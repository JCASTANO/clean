package com.ceiba.controlador;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.consulta.manejador.ManejadorListarPeliculas;
import com.ceiba.modelo.dto.DtoPelicula;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/privada/peliculas")
@Api(tags = { "Controlador pelicula"})
public class ConsultaControladorPelicula {
	
	private final ManejadorListarPeliculas manejadorListarPeliculas;
	
	public ConsultaControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
	}

	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation("listar")
	public Collection<DtoPelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}
}
