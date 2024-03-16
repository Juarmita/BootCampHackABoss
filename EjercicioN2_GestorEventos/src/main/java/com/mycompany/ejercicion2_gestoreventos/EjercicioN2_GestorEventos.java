/*
    Ejercicio 2
    -----------
    Imagina que estás construyendo una aplicacion para gestionar eventos en una
    agenda. Cada evento tiene un nombre, una fecha y una categoria. Implementa
    las siguientes operaciones utilizando Streams y Optionals:
        -Filtra los eventos que estan programados para una fecha especifica
        -Agrupa los eventos por categoria y cuenta cuantos eventos hay en cada categoria
        -Encuentra el evento más proximo en el tiempo utilizando Optionals
 */
package com.mycompany.ejercicion2_gestoreventos;

import com.mycompany.ejercicion2_gestoreventos.logic.Evento;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EjercicioN2_GestorEventos {

    public static void main(String[] args) {
        //Hacemos la instancia a la lista
        List<Evento> eventos = List.of(
                new Evento("Java", LocalDate.of(2024, 02, 13), "Conferencia"),
                new Evento("JavaScript", LocalDate.of(2023, 2, 19), "Taller"),
                new Evento("CSS", LocalDate.of(2024, 05, 4), "Reunion"),
                new Evento("Symfony", LocalDate.of(2025, 01, 1), "Conferencia"),
                new Evento("React", LocalDate.of(2022, 07, 25), "Reunion"),
                new Evento("Angular", LocalDate.of(2024, 12, 13), "Conferencia"));
    
        //Filtramos para fecha especifica
        LocalDate fechaFiltrada = LocalDate.of(2023, 2, 19);
        
        List<Evento> filtradoEventos = eventos.stream()
                .filter(n -> n.getFecha().equals(fechaFiltrada))
                .collect(Collectors.toList());
        
        System.out.println("El evento de la fecha "+fechaFiltrada+" es :");
        filtradoEventos.forEach(evento -> System.out.println(evento.getNombre()));
        
        
        //Filtrado por categoria
        String categoriaFiltrada = "Conferencia";
        List<Evento> filtroCategoria = eventos.stream()
                .filter(n -> n.getCategoria().equalsIgnoreCase(categoriaFiltrada))
                .collect(Collectors.toList());
        
        int totalCategorias = filtroCategoria.size();
        
        System.out.println("Hay un total de "+totalCategorias+" de este evento");
        
        //Usamos optinals para el evento mas proximo
        Optional<Evento> masProximo = eventos.stream()
                .min((evento1, evento2) -> evento1.getFecha().compareTo(evento2.getFecha()));
        
        masProximo.ifPresentOrElse(
            evento -> System.out.println("El evento mas proximo es: "+evento.getNombre()),
            () -> System.out.println("No hay eventos"));
    
    }
    
    
    
        
        
}
