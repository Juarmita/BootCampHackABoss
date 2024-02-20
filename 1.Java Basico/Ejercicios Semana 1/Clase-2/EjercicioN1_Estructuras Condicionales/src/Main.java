/*
    Ejercicio 1
    -----------
    a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
    a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no
    ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos la instancia para usar Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario que introduzca su edad
        System.out.println("Introduzca su edad: ");
        int edad = scanner.nextInt();//Asignamos a la variable edad el valor introducido por teclado
        if(edad >= 18){//
            System.out.println("Puede ingresar al recital");
        } else {
            System.out.println("Eres menor de edad, no puedes ingresar al recital");
        }

    }
}