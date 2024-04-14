package org.example.logic;

public class Trabajador extends Thread{

    // Atributos
    private String nombre;
    private Tareas tarea;

    // Constructor
    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public void asignarTarea(Tareas tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {
        System.out.println(nombre + " ha comenzado a trabajar");
        tarea.ensamblarProducto();
        tarea.controlCalidad();
        tarea.embalarProducto();
        System.out.println(nombre + " ha terminado de trabajar");
    }
}
