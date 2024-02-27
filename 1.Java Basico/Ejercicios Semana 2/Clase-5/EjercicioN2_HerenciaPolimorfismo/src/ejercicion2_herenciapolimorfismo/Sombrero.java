package ejercicion2_herenciapolimorfismo;

public class Sombrero extends Vestimenta{
    
    //Atributos hija
    private String tipo;
    private String tamaño;
    
    //Constructores

    public Sombrero() {
    }

    public Sombrero(String tipo, String tamaño, Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    
    //Metodo
    public void mensaje() {
        System.out.println("Este sombrero es de marca: " +marca);
    }
}
