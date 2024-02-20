/*
    Ejercicio 4
    -----------
    Crea un programa que pida al usuario que ingrese por teclado dos numeros enteros y realice las siguientes operaciones
    con ellos: suma, resta, multiplicacion y división. Muestra por pantalla/consola los resultados de cada una de las
    operaciones con un mensaje amigable para el usuario.

    EXTRA: ¿Qué sucede si como segundo número de una división se ingresa 0? Tenemos un error aritemtico(ArithmeticException)
    Con lo que sabes o aprendiste hasta ahora…
    ¿De qué manera tratarías de evitar ésta situación? Con operadores logicos
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos la instancia de scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese por favor el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese por favor el segundo número entero: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("El resultado para las distintas operaciones es: ");
        System.out.println("Suma: "+suma+"\n Resta: "+resta+"\n Multiplicacion: "+multiplicacion+"\n Division: "+division);
    }
}