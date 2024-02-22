/*
    Ejercicio 2
    -----------
    Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

    a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
    b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
    c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar
    el después de los datos de las dos personas cuyos nombres fueron cambiados.
    d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
 */

public class Main {
    public static void main(String[] args) {

        //Declaracion del vector
        Persona[] personas = new Persona[5];

        //Creacion de las 5 personas
        personas[0] = new Persona(1, "Luisa", 44, "Finca Las Lagrimas", "+586565418");
        personas[1] = new Persona(2, "Alonso", 52, "Calle Pacifico", "+345464651");
        personas[2] = new Persona(3, "Pedro", 15, "Av Andalucia", "+16542134");
        personas[3] = new Persona(4, "Mercedes", 20, "Teatinos", "+5646541318");
        personas[4] = new Persona(5, "Angela", 65, "Calle Jacinto Benavente", "+31321654");


        //Usamos un bucle para recorrer el array
        for(Persona elemento : personas){
            System.out.println("El nombre es: "+elemento.getNombre()+", y su edad es: "+elemento.getEdad());
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }

        //Antes y despues del cambio
        System.out.println("\nEL nombre del primer elemento es: "+personas[0].getNombre()+" y el de la segunda: "+personas[1].getNombre());
        //Realizamos el cambio de nombre
        personas[0].setNombre("Carolina");
        personas[1].setNombre("David");
        //Mostramos los nombres tras el cambio
        System.out.println("EL nombre del primer elemento es: "+personas[0].getNombre()+" y el de la segunda: "+personas[1].getNombre());

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }

        //Imprimimos las personas con + de 30 años
        for (Persona elemento : personas){
            if (elemento.getEdad() > 30){
                System.out.println("\n "+elemento.getNombre());
            }
        }
    }
}