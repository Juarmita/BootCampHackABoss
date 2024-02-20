/*
    Ejercicio 3
    -----------
    Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.
    Recuerda que la fórmula para calcular esto es: (base * altura)/2
     */

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables
        double base = 15, altura = 25, area;
        //Hacemos la operacion y asignamos el valor a la variable area
        area = (base * altura) / 2;
        //Mostramos por pantalla el texto y el contenido de la variable area
        System.out.println("El área del triángulo es: "+area);

    }
}