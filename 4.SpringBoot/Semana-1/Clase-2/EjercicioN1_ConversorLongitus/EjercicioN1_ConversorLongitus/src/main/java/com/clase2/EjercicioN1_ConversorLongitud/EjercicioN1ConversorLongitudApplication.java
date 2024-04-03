package com.clase2.EjercicioN1_ConversorLongitud;

/*
	Ejercicio 1
	-----------
	 Realiza una API que sea capaz de convertir de centímetros a metros. Para ello, se deberá enviar como parámetro
	 mediante una solicitud GET la cantidad de centímetros y la API por su parte deberá devolver como respuesta su equivalente en metros.

	Por ejemplo: Si el parámetro es 163, la API debe devovler 1,63.

	Puedes también agregar mensajes instructivos para que la respuesta sea más atractiva. Por ejemplo:
	 “El equivalente a 163 cm es de 1,63 metros”
*/


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioN1ConversorLongitudApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjercicioN1ConversorLongitudApplication.class, args);
	}

}
