package ejercicion1_collectionsclasesabstractasinterfaces;

public class Camioneta extends Vehiculo implements Combustion {

    //Atributos propios de la clase
    Integer capacidadTanque;
    Double consumoCombustible;

    public Camioneta(Integer capacidadTanque, Double consumoCombustible, Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    //Implementamos los metodos
    @Override
    public int calculoAntiguedad() {
        return 2024 - anio;
    }

    @Override
    public String recargarCombustible() {
        return "Rellenando el tanque......";
    }

}
