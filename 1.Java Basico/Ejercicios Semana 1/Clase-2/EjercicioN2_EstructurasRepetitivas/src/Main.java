/*
    Ejercicio 2
    -----------
    a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios
    productos comprados por un cliente.

    Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario
    decida finalizar. Luego, muestra el total de la compra que debe abonar.

    Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador
    (cuando sabemos un número exacto de productos por ejemplo) o por centinela
    (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”.
    Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos la instancia Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaro e inicializo las variables
        double precio = 0;
        boolean centinela = false;

        //Mensaje para el usuario
        System.out.println("Introduzca los precios de los productos, cuando quiera acabar teclee 0");

        //bucle while para ir introduciendo precios
        while (centinela != true){
            System.out.println("Ingrese un precio: ");
            double precios = scanner.nextDouble();

            //Condicional con centinela
            if(precios == 0){
                centinela = true;
            }else {
                precio += precios;
            }
        }
        System.out.println("El coste total es: "+precio);
    }
}