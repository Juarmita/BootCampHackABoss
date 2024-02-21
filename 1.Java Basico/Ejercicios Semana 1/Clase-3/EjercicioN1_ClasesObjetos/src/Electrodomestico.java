public class Electrodomestico {
    //Atributos
    private int cod;
    private String marca;
    private String modelo;
    private String consumo;
    private String color;

    //Contructores
    //sin parametros
    public Electrodomestico() {
    }
    //Con parametros
    public Electrodomestico(int cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }
    //Metodos
    public void mostrar(){
        System.out.println("La marca es: "+getMarca()+" ,el modelo es: "+getModelo()+" ,y el consumo es: "+getConsumo());
    }

    //Getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}