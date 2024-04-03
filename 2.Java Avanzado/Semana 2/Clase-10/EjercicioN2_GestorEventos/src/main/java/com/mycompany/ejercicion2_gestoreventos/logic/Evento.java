package com.mycompany.ejercicion2_gestoreventos.logic;

import java.time.LocalDate;



public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoria;
    
    //Constructor

    public Evento() {
    }

    public Evento(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    }
    
    

