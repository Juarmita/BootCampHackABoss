/*
    Ejercicio 3
    -----------
    Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y
    acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y
    manejar excepciones estándar de Java teniendo en cuenta lo siguiente:

    Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño fijo para
    simplificar el ejercicio.

    Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando un índice.

    Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector,
    por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.

    Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder a una
    posición inválida en el vector.
 */

package org.example;

public class Main {
    public static void main(String[] args) {

        String[] ventorNombres = new String[5];

        try {
            ventorNombres[0] = "Juan";
            ventorNombres[1] = "Pedro";
            ventorNombres[2] = "Maria";
            ventorNombres[3] = "Ana";
            ventorNombres[4] = "Luis";

            System.out.println(ventorNombres[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Estás intentando acceder a una posición inválida en el vector.");
        }

    }
}