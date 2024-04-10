package org.example.logic;

public class Usuario {
    //Atributos
    private String nombre;
    private String destino;
    private String fecha;
    private int asientosDeseados;

    private int asientosDisponibles = 10;

    //Constructor

    public Usuario() {
    }

    public Usuario(String nombre, String destino, String fecha, int asientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDeseados = asientosDeseados;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAsientosDeseados() {
        return asientosDeseados;
    }

    public void setAsientosDeseados(int asientosDeseados) {
        this.asientosDeseados = asientosDeseados;
    }

    //Metodo
    public void reservarVuelo(String nombre, String destino, String fecha, int asientosDeseados) throws ReservaInvalidaException{
        if(nombre == null || destino == null || fecha == null || asientosDeseados == 0){
            throw new ReservaInvalidaException("Falta información esencial");
        }
        if(asientosDeseados > asientosDisponibles){
            throw new ReservaInvalidaException("No se pueden reservar más asientos de los disponibles");
        }
    }
}
