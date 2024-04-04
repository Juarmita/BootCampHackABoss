package com.clase3.EjercicioN1_GestionEventosAcademicos.controller;

import com.clase3.EjercicioN1_GestionEventosAcademicos.logic.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class eventosController {

    private List<Evento> listaEventos = new ArrayList<>();
    @GetMapping("/eventos")
    public List<Evento> listarEventos(){//Creamos el metodo para listar todos los eventos que hay
        return listaEventos;
    }

    @GetMapping("/{id}")
    public Evento filtrarId(@PathVariable Long id) {
        return listaEventos.stream()
                .filter(evento -> evento.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

    @PostMapping
    public String crearEvento(@RequestBody Evento evento){
        listaEventos.add(evento);
        return "Evento creado: " +evento.getTitulo();
    }

}
