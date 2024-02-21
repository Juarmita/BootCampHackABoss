/*
    Ejercicio 4
    -----------
    Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java
    que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

    Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

    Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento
    (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

    Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

    A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y
    mostrarlo por pantalla luego de cada reserva.

    Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
    ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

    El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine
    que ha finalizado.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos la instancia Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos la matriz 5x5
        int[][] asientos = new int[5][5];
        //Todos los asientos libres
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                asientos[fila][asiento] = 'O';
            }
        }
        //Creamos un bucle con centinela para controlar el final de la compra
        boolean centinela = false;

        while (centinela != true) {

            //Pedimos que seleccione el asiento

         }
        }
    }
}