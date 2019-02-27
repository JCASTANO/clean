eureka
	http://localhost:8761/
zuul
	http://localhost:8762/demo/cinema/privada/peliculas (no funciona sin seguridad)
	http://localhost:8762/publica (funciona sin seguridad)
	http://localhost:8762/admin (no funciona sin seguridad)
	http://localhost:8672/oauth/token
	
Orden de ejecucion
	1. levantar eureka-server
	2. levantar cinema
		arquitectura hexagonal
			aplicacion
				consultas
					manejadores
				comandos
					manejadores
			dominio
				excepcion
				modelo
				puerto - repositorio
				servicio
			infraestructura
				adaptador - repositorio
				configuracion
				controlador
				error
				Application.java
	3. levantar zuul
		seguridad
	
eureka
	https://www.baeldung.com/spring-cloud-netflix-eureka
zuul
	https://www.baeldung.com/zuul-load-balancing
	
oauth
	Servidor de autenticacion
	Servidor de recursos
	
https://dzone.com/articles/securing-rest-services-with-oauth2-in-springboot-1
https://github.com/chuchip/OAuthServer/blob/master/src/main/java/profesorp/oauth2/WebController.java