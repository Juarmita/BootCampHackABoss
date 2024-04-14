package org.example.logic;

public class Tareas {

    // Atributos
    private String tarea;

    // Constructor
    public Tareas(String tarea) {
        this.tarea = tarea;
    }

    // Metodos

    public void ensamblarProducto() {
        System.out.println("Ensamblar producto");
    }

    public void controlCalidad() {
        System.out.println("Control de calidad");
    }

    public void embalarProducto() {
        System.out.println("Embalar producto");
    }
}
