package com.ceiba.seguridad;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@RestController
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	
	@RequestMapping("/publica")
	public String publico() {
		return "Pagina Publica";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "Pagina Administrador";
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/oauth/token", "/oauth/authorize**", "/publica").permitAll();
		http.requestMatchers().antMatchers("/demo/cinema/privada/peliculas")
		.and().authorizeRequests()
		.antMatchers("/demo/cinema/privada/peliculas").access("hasRole('USER')")
		.and().requestMatchers().antMatchers("/admin")
		.and().authorizeRequests()
		.antMatchers("/admin").access("hasRole('ADMIN')");
	}   
}