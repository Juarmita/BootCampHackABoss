package ejercicion2_herenciapolimorfismo;

public class Pantalon extends Vestimenta {

    //Atributos hija
    private String estilo;
    private String tipoTejido;

    //Constructor
    public Pantalon() {
    }

    public Pantalon(String estilo, String tipoTejido, Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }
    
    //Metodo
    public void mensaje() {
        System.out.println("Estos pantalones son de marca: " +marca);
    }

}
