package ejercicion1_collectionsclasesabstractasinterfaces;

public class Moto extends Vehiculo implements Combustion{
    
    //Atributos propios
    Integer cilindrada;
    String tipoMotor;
    
    //Constructor

    public Moto(Integer cilindrada, String tipoMotor, Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    

    @Override
    public int calculoAntiguedad() {
        return 2024 - anio;
    }

    @Override
    public String recargarCombustible() {
        return "Rellenando el tanque.....";
    }
    
    
}
