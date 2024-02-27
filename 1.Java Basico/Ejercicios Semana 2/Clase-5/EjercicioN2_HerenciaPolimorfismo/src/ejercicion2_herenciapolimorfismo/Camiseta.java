package ejercicion2_herenciapolimorfismo;

public class Camiseta extends Vestimenta {

    //Atributos hija
    protected String manga;
    protected String cuello;

    //Constructores
    public Camiseta() {
    }

    public Camiseta(String manga, String cuello, Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    //Metodo
    public void mensaje() {
        System.out.println("Esta camiseta es de marca: " +marca);
    }
}
