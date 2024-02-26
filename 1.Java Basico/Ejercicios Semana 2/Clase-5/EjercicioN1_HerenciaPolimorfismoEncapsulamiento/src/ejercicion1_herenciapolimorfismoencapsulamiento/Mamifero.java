
package ejercicion1_herenciapolimorfismoencapsulamiento;

public class Mamifero extends Animal {

    //atributos propios
    private Integer numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    //Constructores
    public Mamifero(Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat, Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamifero");
    }

}
