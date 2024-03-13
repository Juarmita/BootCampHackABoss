package com.mycompany.Main.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RegistroMascotas<T extends Mascota> {

    Scanner scanner = new Scanner(System.in);
    private List<T> mascotas; //Atributo lista llamado mascotas

    public RegistroMascotas() {
        this.mascotas = new ArrayList<>();
    }

    //Método para agregar mascotas
    public void agregarMascotas(T mascota) {
        mascotas.add(mascota);
        System.out.println("Mascota agregada al registro " + mascota.getNombre());
    }

    //Método para buscar mascotas por nombre
    public void buscarPorNombre(String nombreMascota) {
        List<Mascota<?>> mascotaEncontrada = new ArrayList<>();
        for (T mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombreMascota)) {
                mascotaEncontrada.add(mascota);
            }
        }
        if (mascotaEncontrada.isEmpty()) {
            System.out.println("No se encontraron mascotas con el nombre: " + nombreMascota);
        } else {
            System.out.println("Mascota con el nombre " + nombreMascota + " encontradas");
            for (Mascota<?> mascota : mascotaEncontrada) {
                System.out.println(mascota);
            }
        }
    }

    //Método para buscar mascotas por nombre
    public void buscarPorEspecie(String especieMascota) {
        List<Mascota<?>> mascotaEncontrada = new ArrayList<>();
        for (T mascota : mascotas) {
            if (mascota.getEspecie().equalsIgnoreCase(especieMascota)) {
                mascotaEncontrada.add(mascota);
            }
        }
        if (mascotaEncontrada.isEmpty()) {
            System.out.println("No se encontraron mascotas con el nombre: " + especieMascota);
        } else {
            System.out.println("Mascota con el nombre " + especieMascota + " encontradas");
            for (Mascota<?> mascota : mascotaEncontrada) {
                System.out.println(mascota);
            }
        }
    }
    
    //Metodo para conocer la cantidad total de mascotas
    public void totalMascotas(){
        System.out.println("El tamaño total es de: "+mascotas.size());
    }
    
    //Metodo para generar de forma aleatoria las mascotas
    public void mascotasAleatorias(){
        Random random = new Random();
        System.out.println("Introduzca la cantidad de mascotas a crear, max 6: ");
        int cantidad = scanner.nextInt();
        String[] nombresRandom = {"Manolo", "Melisa", "Chantal", "Charito", "Gago", "Mono"};
        String[] especieRandom = {"Perro", "Gato", "Reptil", "Ave"};
        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombresRandom[random.nextInt(nombresRandom.length)];//eleccion de nombre aleatorio
            int edadAleatoria = random.nextInt(18)+1; //Edad aleatoria entre 1 y 18
            int idAleatorio = random.nextInt();
            String especieAleatoria = especieRandom[random.nextInt(especieRandom.length)];//Eleccion de la especie aleatoria
            agregarMascotas((T)new Mascota<>(idAleatorio,nombreAleatorio,especieAleatoria,edadAleatoria));
        }
    }
}
