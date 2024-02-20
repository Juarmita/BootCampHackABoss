/*
    Ejercicio 2
    -----------
    a) Crea un programa que declare una variable para cada uno de los siguientes tipos
    de datos: int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido por consola.

    b)Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double
    ¿qué sucede con el programa? No compila ya que al ser fuertemente tipado no se pueden asignar tipos distintos
    ¿Se produce algún error? Si
    ¿En qué situaciones se genera error y en cuáles no?
    Justificar el por qué de cada caso

 */

public class Main {
    public static void main(String[] args){
        //Apartado a)
        int numero = 54;
        double decimal = 0.54;
        boolean ItsTrue = true;
        String nombre = "Lucas";
        System.out.println("El número es: "+numero+"\n el decimal es: "+decimal+"\n el booleano es: "+ItsTrue+"\n y el string: "+nombre);

        //Apartado b)
        int numero2 = "Hola"; //Un string(cadena de caracteres) no puede asignarse a una variable tipo int (numero entero)
        double decimal2 = false;//Un booleano (true or false), no puede asignarse a un tipo double(numero decimal)
        boolean ItsTrue2 = 54;//No se puede asignar un tipo int(entero) a una variable de tipo booleana (true or false)
        String nombre2 = 0.15;//No se puede asignar un double(decimal) a una variable de tipo String
        System.out.println("El número es: "+numero+"\n el decimal es: "+decimal+"\n el booleano es: "+ItsTrue+"\n y el string: "+nombre);

    }
}