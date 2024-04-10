/*
    Ejercicio 1
    -----------
    Reserva de Vuelos

    Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea.
    Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje
    y número de asientos deseados. Tu tarea es implementar una función de reserva de vuelos que valide los datos
    ingresados y maneje excepciones si los datos son incorrectos o si no hay suficientes asientos disponibles en el vuelo.

    Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones
    excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o si falta información
    esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la causa del error.
 */
package org.example;

import org.example.logic.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Juan", "Madrid", "12/12/2021", 5);
        try {
            usuario.reservarVuelo(usuario.getNombre(), usuario.getDestino(), usuario.getFecha(), usuario.getAsientosDeseados());
            System.out.println("Reserva realizada con éxito por: "+usuario.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Usuario usuario2 = new Usuario("Pedro", "Madrid", "12/12/2021", 15);
        try {
            usuario2.reservarVuelo(usuario2.getNombre(), usuario2.getDestino(), usuario2.getFecha(), usuario2.getAsientosDeseados());
            System.out.println("Reserva realizada con éxito por:" +usuario2.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}