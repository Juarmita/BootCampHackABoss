package ejercicion2_herenciapolimorfismo;

public class Vestimenta {

    //atributos
    protected Integer codigo;
    protected String nombre;
    protected Double precio;
    protected String marca;
    protected String talla;
    protected String color;

    //Constructores
    public Vestimenta() {
    }

    public Vestimenta(Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }
    
    //Metodo
    public void mensaje() {
        System.out.println("Mensaje generico");
    }

    //Getters y Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
