package com.mycompany.Main.logic;

public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private double salario;
    private String categoria;
    
    //Constructor

    public Empleado() {
    }

    public Empleado(int id, String nombre, double salario, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }
    
    //Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
