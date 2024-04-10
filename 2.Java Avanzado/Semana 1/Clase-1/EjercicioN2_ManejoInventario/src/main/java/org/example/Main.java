/*
    Ejercicio 2
    -----------
    Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios
    pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la
    cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos
    ingresados y manejando excepciones en caso de errores o datos inválidos.

    Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de
    utilizar los tipos correctos de excepción en cada caso.
 */

package org.example;

import org.example.exception.ProductoException;
import org.example.logic.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Producto 1", 10.0, 5);
        try {
            producto.validacionDatos();
            System.out.println("Producto validado correctamente");
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }

        Producto producto2 = new Producto("", 0.0, -1);
        try {
            producto2.validacionDatos();
            System.out.println("Producto validado correctamente");
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }
    }
}