/*
    Ejercicio 2
    -----------
    Gestor eventos
    Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre,
    una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
    utilizando Streams y Optionals:

    Filtra los eventos que están programados para una fecha específica.

    Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

    Encuentra el evento más próximo en el tiempo utilizando Optionals.
 */

package org.example;

import org.example.logic.Evento;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Creamos la lista de eventos
        List<Evento> listaEventos = List.of(
                new Evento("Reunión de equipo", "17-04-2024", "Reunión"),
                new Evento("Conferencia de tecnología", "18-08-2024", "Conferencia"),
                new Evento("Taller de desarrollo", "24-01-2019", "Taller"),
                new Evento("Entrevista de trabajo", "22-04-2017", "Entrevista"),
                new Evento("Presentación de proyecto", "10-07-2024", "Presentación"),
                new Evento("Seminario de negocios", "02-09-2018", "Seminario"),
                new Evento("Curso de marketing", "07-10-2021", "Curso"),
                new Evento("Charla de motivación", "31-01-2022", "Charla"),
                new Evento("Conferencia de arte", "25-02-2018", "Conferencia"),
                new Evento("Taller de cocina", "31-12-2019", "Taller")
        );

        //Filtro los eventos por fecha
        String fechaEspecifica = "10-07-2024";

        List<Evento> filtrarFecha = listaEventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("Eventos para la fecha especifica: "+filtrarFecha);

        //Agrupar por categoria
        Map<String, Long> eventosPorCategoria = listaEventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("Eventos por categoria: ");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad));

        LocalDate fechaActual = LocalDate.now();//Obtenemos la fecha actual para saber cual es la fecha mas cercana

        Optional<Evento> eventoProximo = listaEventos.stream()//Usamos el optional para comprobar cual es el evento mas cercano
                .min((evento1, evento2) ->//Declaramos evento1 y 2 para compararlos como parametros en la funcion lambda
                        LocalDate.parse(evento1.getFecha()).compareTo(LocalDate.parse(evento2.getFecha())));

        eventoProximo.ifPresent(evento -> System.out.println("\nEl evento más próximo es: " + evento.getNombre()));
    }
}