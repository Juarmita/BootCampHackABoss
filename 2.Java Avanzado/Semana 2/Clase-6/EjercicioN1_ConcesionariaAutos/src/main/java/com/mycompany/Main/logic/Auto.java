package com.mycompany.Main.logic;

public class Auto {
    
    //Declaracion de atributos
    private String marca;
    private String modelo;
    private String año;
    private Double precio;
    
    //Constructores

    public Auto() {
    }

    public Auto(String marca, String modelo, String año, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
    
    //Getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
