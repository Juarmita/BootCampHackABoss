package com.clase2.EjercicioN1_ConversorLongitud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class longitudController {

    @GetMapping("/conversor")//Mapeo la url
    public String convertirMedida(@RequestParam Float centimetros){//Metodo para hacer la conversion, traemos con @RequestParam el parametro de consulta de la URL
        float resultado = centimetros / 100;
        return "El resultado de su conversión de centimeros a metros es: "+resultado;
    }
}
