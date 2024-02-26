package ejercicion1_herenciapolimorfismoencapsulamiento;

public class Reptil extends Animal {
    //atributos

    private Double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    //Constructor
    public Reptil(Double longitud, String tipoEscamas, String tipoVeneno, String habitat, Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil");
    }

}
