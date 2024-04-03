package com.clase1.generadorDatosCuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class generadorController {

    Random random = new Random();//Hago la instancia al metodo random

    //Genero la lista de datos
    List<String> listaDatos = List.of(
            "Los aguacates son una fruta, no una verdura.",
            "La Torre Eiffel puede ser 15 cm más alta durante el verano.",
            "Los dientes humanos son la única parte del cuerpo que no puede curarse por sí misma",
            "Google Images se creó literalmente después de que Jennifer López llevara ese famoso vestido en los Grammy del año 2000",
            "Se puede escuchar el latido de una ballena azul a más de 3 kilómetros de distancia");

    //Creo el metodo generador
    @GetMapping("/")
    public String generadorDatos(){

        int index = random.nextInt(listaDatos.size()); //Uso el metodo random para obtener el indice

        return listaDatos.get(index); //Devuelvo el dato curioso por su indice

    }

}
