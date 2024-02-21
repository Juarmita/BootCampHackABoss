/*
    Ejercicio 1
    -----------
    Crear una clase llamada Electrodomestico
    (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los
    siguientes atributos: cod, marca, modelo, consumo y color.

    Luego, realiza las siguientes acciones:
    a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
    b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
    c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
    d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así…
    ¿Qué valor se obtiene?
 */

public class Main {
    public static void main(String[] args) {
        //Creacion de los objetos
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "LG", "UltraWide", "50W", "Negro" );
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Sony", "HomeCinema", "2500W", "Gris" );
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Toshiba", "NewWash", "1500W", "Metalizado" );

        Electrodomestico electrodomestico4 = new Electrodomestico();

        //Mostramos por pantalla  usando el metodo
        electrodomestico1.mostrar();
        electrodomestico2.mostrar();
        electrodomestico3.mostrar();

        //Intentamos mostrar la marca del electrodomestico4
        System.out.println("Marca es:"+electrodomestico4.getMarca());
    }
}