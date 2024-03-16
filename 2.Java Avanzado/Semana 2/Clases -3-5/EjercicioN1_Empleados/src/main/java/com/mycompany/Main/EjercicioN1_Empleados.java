/*
    Ejercicio 1
    -----------
    Crea una aplicación que maneje información sobre empleados. Cada empleado 
    tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). 
    Implementa las siguientes operaciones utilizando Streams y Optionals:

    Filtra los empleados cuyo salario sea mayor a cierto valor específico.

    Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

    Encuentra al empleado con el salario más alto utilizando Optionals.
 */

package com.mycompany.Main;

import com.mycompany.Main.logic.Empleado;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjercicioN1_Empleados {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        
        //Creamos una lista de objetos
        List<Empleado> listaEmpleados = List.of(
                        new Empleado(0, "Juan", 1245.25, "Desarrollador"),
                        new Empleado(1, "Pedro", 1500, "Analista"),
                        new Empleado(2, "Marta", 1800, "Gerente"),
                        new Empleado(3, "Carlos", 1457.85, "Analista"));
        
        //Filtramos los empleados por sueldo y los recolectamos en una lista
        List<Empleado> optionalEmpleado = listaEmpleados.stream()
                .filter(n -> n.getSalario() > 1300)
                .collect(Collectors.toList());
        
        System.out.println("Los empleados con un sueldo mayor a 1300 son: ");
        optionalEmpleado.forEach(empleado -> System.out.println(empleado.getNombre()));
        
        
        //Agrupamos los empleados por categoria
        System.out.println("Introduzca la categoria: ");//Pedimos que introduzca la categoria que se quiere buscar
        String categoria = scanner.nextLine();
        
        double filtroCategoria = listaEmpleados.stream()//Filtramos la categoria y hacemos el promedio
                .filter(n -> n.getCategoria().equalsIgnoreCase(categoria))
                .mapToDouble(n -> n.getSalario())
                .average()
                .orElse(0.0);
        
        System.out.println("El promedio para esta categoria es: "+filtroCategoria);//Mostramos por pantalla el promedio
        
        //Filtro sueldo mas alto
        Optional<Empleado> sueldoAlto = listaEmpleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));//Usamos max para encontrar el sueldo más alto de la lista
        sueldoAlto.ifPresent(empleado -> System.out.println("El empleado con el sueldo más alto es: "+empleado.getNombre()));
        
    }
}
