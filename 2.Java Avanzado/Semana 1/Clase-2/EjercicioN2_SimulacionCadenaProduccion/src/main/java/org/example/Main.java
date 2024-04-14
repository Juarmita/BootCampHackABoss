/*
    Ejercicio 2
    -----------
    Simulacion Cadena de Produccion
    • Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar
      tareas concurrentemente.
    • Cada trabajador se representa como un hilo independiente.
    • Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar
      productos.
    • Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
    • Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación
    entre las tareas.
 */

package org.example;

import org.example.logic.Tareas;
import org.example.logic.Trabajador;

public class Main {
    public static void main(String[] args) {
// Crear trabajadores
        Trabajador trabajador1 = new Trabajador("Trabajador 1");
        Trabajador trabajador2 = new Trabajador("Trabajador 2");
        Trabajador trabajador3 = new Trabajador("Trabajador 3");

        Thread hilo1 = new Thread(trabajador1);
        Thread hilo2 = new Thread(trabajador2);
        Thread hilo3 = new Thread(trabajador3);

        // Crear tareas
        Tareas tarea1 = new Tareas("Tarea 1");
        Tareas tarea2 = new Tareas("Tarea 2");
        Tareas tarea3 = new Tareas("Tarea 3");

        // Asignar tareas a trabajadores
        trabajador1.asignarTarea(tarea1);
        trabajador2.asignarTarea(tarea2);
        trabajador3.asignarTarea(tarea3);

        // Iniciar trabajadores
        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        // Esperar a que los trabajadores terminen
        try {
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Producción finalizada");
    }
}