package ejercicion2_herenciapolimorfismo;

public class Zapato extends Vestimenta {

    //Atributos hija
    private String material;
    private String tipoCierre;

    //Constructor
    public Zapato() {
    }

    public Zapato(String material, String tipoCierre, Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Metodo
    public void mensaje() {
        System.out.println("Estos zapatos son de marca: " +marca);
    }
}
