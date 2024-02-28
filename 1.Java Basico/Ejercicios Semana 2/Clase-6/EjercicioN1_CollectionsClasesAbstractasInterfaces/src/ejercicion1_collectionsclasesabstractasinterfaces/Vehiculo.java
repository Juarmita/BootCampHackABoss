package ejercicion1_collectionsclasesabstractasinterfaces;


public abstract class Vehiculo {
    //Atributos
    Integer id;
    String placa;
    String marca;
    String modelo;
    Integer anio;
    Double costo;
    
    //Constructor

    public Vehiculo(Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }
    
    //Metodo
    public abstract int calculoAntiguedad();
}
