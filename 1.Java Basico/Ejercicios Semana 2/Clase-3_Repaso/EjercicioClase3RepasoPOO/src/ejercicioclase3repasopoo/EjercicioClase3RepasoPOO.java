/*
    Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase 
    llamada Verdura, que tenga los siguientes atributos: id, nombre, color, 
    calorías, debeCocinarse (tener en cuenta todos sus atributos, constructores, 
    métodos getters y setters).
    Luego, realiza las siguientes acciones:

    a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. 
    Crear 5 verduras y guardarlas en el vector.
    b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías 
    de las verduras almacenadas.
    c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos 
    de todas las verduras luego del cambio.
    d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que 
    sean de color verde.

    División de tareas GRUPALES
    Para fomentar la colaboración en equipo, se propone la siguiente actividad:
    Desarrollar el sistema de verduras especificado en el escenario y crear un  
    repositorio en Git para guardarlo allí. Trabajar en colaboración en el 
    repositorio de Git, fusionando las ramas cuando se completen las tareas y 
    resolviendo conflictos si es necesario.
    Dividir el equipo en roles, como desarrolladores, testers y responsables de 
    documentación.
    El/Los desarrolladores trabajarán en la implementación de la clase 
    "Verdura" y la funcionalidad del programa. Si son varios, dividir las 
    tareas, gestionar diferentes ramas y hacer los pushes correspondientes.
    El/Los testers realizarán pruebas de funcionamiento para asegurarse de que 
    el programa funcione correctamente.
    El/Los responsables de documentación deberán crear un informe que sirva de 
    documentación del sistema creado, donde se especifiquen las funcionalidades 
    del sistema, las pruebas realizadas por los testers y los resultados obtenidos.
    Al finalizar, presentar el sistema completo con documentación y realizar    
    una revisión grupal para asegurarse que todos los entregables están correctos.
 */
package ejercicioclase3repasopoo;

public class EjercicioClase3RepasoPOO {

    public static void main(String[] args) {
        //Creacion de array
        Verdura[] verduras = new Verdura[5];

        //Creacion de las verduras
        verduras[0] = new Verdura(0, "Brocoli", "Verde", 34, true);
        verduras[1] = new Verdura(1, "Zanahoria", "Naranja", 34, false);
        verduras[2] = new Verdura(2, "Pimiento", "Verde", 29, true);
        verduras[3] = new Verdura(3, "Lechuga", "Verde", 15, false);
        verduras[4] = new Verdura(4, "Puerro", "Blanco", 24, true);

        //Recorrer el vector y mostrar nombre y calorias
        for (Verdura elemento : verduras) {
            System.out.println("El nombre de la verdura es: " + elemento.getNombre() + " y tiene " + elemento.getCalorías() + " calorias");
        }

        //Recorrer el vector y mostrar nombre y calorias
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println(" ");

        //Cambiamos los datos de 2 verduras, por ejemplo [1] y [4]
        verduras[1].setNombre("Tomate");
        verduras[1].setColor("Rojo");
        verduras[1].setCalorías(28);
        verduras[1].setDebeCocinarse(false);

        verduras[4].setNombre("Calabaza");
        verduras[4].setColor("Naranja");
        verduras[4].setCalorías(45);
        verduras[4].setDebeCocinarse(true);

        //Mostramos todo tras el cambio
        for (Verdura elemento : verduras) {
            System.out.println("El nombre de la verdura es: " + elemento.getNombre() + " y tiene " + elemento.getCalorías() + " calorias");
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println(" ");

        //Recorremos el vector y mostramos solo las que sean de color verde
        for (Verdura elemento : verduras) {

            if (elemento.getColor().equals("Verde")) {

                System.out.println("El nombre de la verdura es: " + elemento.getNombre() + " y su color es: " + elemento.getColor());

            }
        }
    }

}
    
