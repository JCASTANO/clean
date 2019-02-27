eureka
	http://localhost:8761/
zuul
	http://localhost:8762/demo/cinema/peliculas
	
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