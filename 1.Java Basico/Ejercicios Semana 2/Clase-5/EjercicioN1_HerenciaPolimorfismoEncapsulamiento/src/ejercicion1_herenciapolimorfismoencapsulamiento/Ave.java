package ejercicion1_herenciapolimorfismoencapsulamiento;

public class Ave extends Animal {

    //Atributos
    private Integer envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    //Constructores
    public Ave() {
    }

    public Ave(Integer envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico, Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }

}
