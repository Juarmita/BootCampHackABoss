/*
    Ejercicio 1
    -----------
    a)Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario.
    Por ejemplo: "Hola, bienvenido al sistema".

    b) Una vez lograda esta primera parte, permitir que se almacene el nombre del usuario en una variable y se
    muestre el mismo en el mensaje.
    Por ejemplo: "Hola Eduardo, bienvenido al sistema."
 */

public class main {
    public static void main(String[] args) {
        //Apartado a)
        //Con sout mostramos el mensaje por pantalla para el usuario.
        System.out.println("Hola, bienvenido al sistema");

        //Apartado b)
        //Asignamos un nombre a una variable de tipo String y lo mostramos por pantalla
        String nombre = "Juan Manuel";//Asignación del nombre
        System.out.println("Hola "+nombre+", bienvenido al sistema");//Mostramos por pantalla con las concatenaciones correspondientes
    }
}
