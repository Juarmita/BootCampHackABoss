package com.mycompany.Main.logic;

public class Mascota<T> {
    //Atributos
    private Integer id;  
    private String nombre;
    private String especie;
    private Integer edad;
    
    //Constructores

    public Mascota() {
    }

    public Mascota(Integer id, String nombre, String especie, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    //Getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + '}';
    }
    
}
