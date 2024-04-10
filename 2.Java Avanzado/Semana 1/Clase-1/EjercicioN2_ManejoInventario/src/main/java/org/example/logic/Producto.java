package org.example.logic;

import org.example.exception.ProductoException;

public class Producto {

    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    //metodo
    public void validacionDatos() throws ProductoException{
        if (nombre == null || nombre.isEmpty()) {
            throw new ProductoException("El nombre del producto no puede estar vacío");
        }
        if (precio <= 0 ) {
            throw new ProductoException("El precio del producto no puede ser menor o igual a 0");
        }
        if (cantidad < 0) {
            throw new ProductoException("La cantidad del producto no puede ser menor a 0");
        }
    }
}
