/*
    Ejercicio 1
    -----------
    Una concesionaria de vehículos necesita un sistema para administrar su inventario 
    de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. 
    Implementa una clase utilitaria InventarioAutos con métodos genéricos para 
    realizar las siguientes operaciones:

    Agregar Autos al Inventario: Utiliza un método genérico para agregar autos 
    al inventario de la concesionaria.

    Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan 
    buscar autos por marca o año dentro del inventario.

    Calcular el Valor Total del Inventario: Desarrolla un método genérico que 
    calcule el valor total de todos los autos en el inventario.
 */

package com.mycompany.Main;

import com.mycompany.Main.logic.Auto;
import com.mycompany.Main.logic.InventarioAutos;

public class EjercicioN1_ConcesionariaAutos {

    public static void main(String[] args) {
        //Instanciamos al inventario
        InventarioAutos autos = new InventarioAutos();
        
        autos.agregarProducto(new Auto("Seat", "Altea", "2006", 23000.00));
        autos.agregarProducto(new Auto("Nissan", "Micra", "2019", 18000.00));
        autos.agregarProducto(new Auto("Toyota", "CH-R", "2024", 35000.00));
        
        autos.buscarPorMarca();
        autos.valorTotal();
    }
}
