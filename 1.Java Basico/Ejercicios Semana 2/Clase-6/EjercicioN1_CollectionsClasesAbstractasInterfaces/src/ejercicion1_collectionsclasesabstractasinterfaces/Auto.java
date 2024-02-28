package ejercicion1_collectionsclasesabstractasinterfaces;

public class Auto extends Vehiculo implements Electrico {

    //Atributos propios
    private Double capacidadBateria;
    private Double autonomia;

    //Constructor
    public Auto(Double capacidadBateria, Double autonomia, Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calculoAntiguedad() {
        return 2024 - anio;
    }

    @Override
    public String cargarEnergia() {
        return "Cargando el vehiculo....";
    }

}
