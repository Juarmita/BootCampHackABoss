
package ejercicioclase3repasopoo;

public class Verdura {

    //Atributos
    private Integer id;
    private String nombre;
    private String color;
    private Integer calorías;
    private boolean debeCocinarse;

    //Constructores
    public Verdura() {
    }

    public Verdura(Integer id, String nombre, String color, Integer calorías, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorías = calorías;
        this.debeCocinarse = debeCocinarse;
    }

    //Metodos
    //Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCalorías() {
        return calorías;
    }

    public void setCalorías(Integer calorías) {
        this.calorías = calorías;
    }

    public boolean isDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

}
