package com.mycompany.Main.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InventarioAutos <T extends Auto> {
    Scanner scanner = new Scanner(System.in);
    
    
    private List<T> autos; //Declaracion de la lista generica de nombre auto
    
    //Constructores

    public InventarioAutos() { //Instanciamos al constructor
        this.autos = new ArrayList<>();
    }
    
    //Metodos
    
    public void agregarProducto(T auto){
        autos.add(auto);
        System.out.println("Producto agregado al inventario: "+auto.getModelo());
    }
    
    public void buscarPorMarca(){//Metodo para encontrar por marca
        boolean encontrado = false;//
        System.out.println("Introduzca la marca del coche: ");
        String marcaBusqueda = scanner.next();
        for (T auto : autos) {//Recorro la lista comprobando la marca
            if (auto.getMarca().equals(marcaBusqueda)) {//Si coincide con la marca introducida por teclado
                System.out.println("Vehiculo de marca: "+marcaBusqueda+" encontrado");//Mensaje de encontrado
                encontrado = true;//Nuestro centinela pasa a true
            }
        } 
          if(!encontrado){
              System.out.println("Marca del vehiculo: "+marcaBusqueda+" no encontrada");
            }
        }
    
    public void valorTotal(){
        double suma = 0;
        for (T auto : autos) {
            suma += auto.getPrecio();
        }
        System.out.println("El precio del inventario es: "+suma);
    }
    }

