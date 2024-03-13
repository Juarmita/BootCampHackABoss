/*
    Ejercicio 2
    -----------
    Una clínica veterinaria necesita un sistema para administrar su registro de 
    mascotas, para ello, se solicita la definición de una clase genérica Mascota<T> 
    con atributos como nombre, edad, y especie (no olvides el código o id de 
    mascota para identificar a cada una). Crea una clase utilitaria propia llamada 
    RegistroMascotas que cuente con métodos genéricos para:

    Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto 
    con genéricos para manipular colecciones como ArrayList o LinkedList y 
    agregar mascotas de distinto tipo al registro de la veterinaria 
    (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).

    Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases 
    utilitarias como Collections o Arrays junto con genéricos para realizar 
    búsquedas eficientes por nombre o especie dentro del registro de mascotas.

    Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de 
    java.util  para obtener el tamaño de la colección y contar la cantidad 
    total de mascotas registradas en la veterinaria.

    Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  
    para generar datos aleatorios, como nombres, edades o especies, para agregar 
    mascotas al registro.
 */
package com.mycompany.Main;

import java.util.Collections;
import java.util.Scanner;


public class EjercicioN2_Veterinaria {
    
    public static void main(String[] args) {
        
        String nombreMascota;
        
        Scanner scanner = new Scanner(System.in);
        //Creamos el objeto
        RegistroMascotas<Mascota> mascota = new RegistroMascotas();
        
        //Creamos varias mascotas para las pruebas
        mascota.agregarMascotas(new Mascota(1, "Ami", "Perro", 12));
        mascota.agregarMascotas(new Mascota(2, "Poti", "Perro", 18));
        mascota.agregarMascotas(new Mascota(3, "Agata", "Gato", 1));
        mascota.agregarMascotas(new Mascota(4, "Agato", "Gato", 1));
        mascota.agregarMascotas(new Mascota(5, "Paco", "Loro", 5));
        
        
        //Creamos las mascotas de forma aleatoria
        mascota.mascotasAleatorias();
        //Buscar mascotas por nombre
        System.out.println("Introduzca el nombre de la mascota a buscar: ");
        nombreMascota = scanner.nextLine();
        mascota.buscarPorNombre(nombreMascota);
        //Buscar por especie
        System.out.println("Introduzca la especie de la mascota: ");
        String especieMascota = scanner.nextLine();
        mascota.buscarPorEspecie(especieMascota);
        //Cantidad de mascotas
        mascota.totalMascotas();
        
        
    }
    }


