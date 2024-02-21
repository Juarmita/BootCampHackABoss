/*
    Ejercicio 3
    -----------
    Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
    calcule la temperatura máxima promedio que hubo.

    Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura
    máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo
    el vector y mostrando el resultado por pantalla.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos la instancia Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaramos el vector de tamaño 7 y variables
        int[] vector = new int[7];
        double suma = 0;
        double promedio = 0;


        //Vamos a introducir las temperaturas en el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduzca la temperatura máxima para hoy: ");
            vector[i] = scanner.nextInt();
        }
        /*
        Comprobacion de que se guarda correctamente todo en el vector
        for (int elemento : vector) {
            System.out.print(" "+elemento);
        }
        System.out.println("");
         */

        //Bucle for para la realizacion de la suma
        for (int i = 0; i < vector.length; i++) {
            suma = suma + i;
        }

        promedio = suma / vector.length;
        System.out.println("El promedio de temperaturas es: "+promedio);
    }
}