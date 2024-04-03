package com.clase1.generadorRefranes;

/*
	Ejercicio 1
	-----------
	Crear un programa que, al acceder a localhost:8080 a través de un navegador mediante el métoido GET, devuelva un
	refrán aleatorio de una lista predefinida. Por ejemplo: “No hay mal que por bien no venga”,
	“Al que madruga Dios lo ayuda”, etc.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneradorRefranesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneradorRefranesApplication.class, args);
	}

}
