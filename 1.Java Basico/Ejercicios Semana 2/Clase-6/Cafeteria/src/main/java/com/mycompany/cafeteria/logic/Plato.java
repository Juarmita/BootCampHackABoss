
package com.mycompany.cafeteria.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plato implements Serializable {
    //Atributos
    @Id //Mapeamos la id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con esto generamos la id de forma automatica
    private int id;
    private String nombre;
    private String receta;
    private Double precio;
    private Boolean borrado;//Borrado logico
    
    //Creamos los constructores

    public Plato() {
    }

    public Plato(int id, String nombre, String receta, Double precio, boolean borrado) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
        this.borrado = false;
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

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato{" + "id=" + id + ", nombre=" + nombre + ", receta=" + receta + ", precio=" + precio + '}';
    }
    
    
}
