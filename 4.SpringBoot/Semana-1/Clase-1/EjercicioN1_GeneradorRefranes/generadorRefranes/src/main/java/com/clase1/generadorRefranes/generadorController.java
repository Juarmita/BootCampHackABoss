package com.clase1.generadorRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class generadorController {

    //Creo la lista de refranes con list.of porque van a estar predefinidos
    List<String> listaRefranes = List.of("El hábito no hace al monje",
            "Una golondrina no hace verano",
            "Poco a poco, se anda lejos",
            "Haz bien y no mires a quien");
    @GetMapping("/")
    public String seleccionRefran(){ //Creo el metodo para la seleccion del refran
        Random random = new Random(); //Hago la instancia del método random

        int index = random.nextInt(listaRefranes.size()); //Asigno a la variable index el numero de forma aleatoria de la lista de refranes
        return listaRefranes.get(index); //Devuelvo el refrean por el indice al que pertenece




    }

}
