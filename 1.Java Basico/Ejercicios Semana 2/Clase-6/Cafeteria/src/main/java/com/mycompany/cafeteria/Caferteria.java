package com.mycompany.cafeteria;

import com.mycompany.cafeteria.logic.Controladora;
import com.mycompany.cafeteria.logic.Plato;
import java.util.ArrayList;
import java.util.List;

public class Caferteria {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();//Simulamos un usuario
        
        
        /*Proceso de altas*/
        /*
        //Creamos objeto
        Plato plat1 = new Plato(1, "Milanesa a la napolitana", "filete empanao", 15.95);
        //Metodo para crear el plato
        control.crearPlato(plat1);
        */
//        Plato plat2 = new Plato(2, "Espaguettis Boloñesa", "Salsa de tomate", 12.87);
//        Plato plat3 = new Plato(3, "Pizza Margarita", "Receta Clásica", 9.00);
//        
//        control.crearPlato(plat2);
//        control.crearPlato(plat3);
        
        /*Proceso de lectura*/
        List<Plato> listaPlatos = control.traerPlatos();
        
        for (Plato listaPlato : listaPlatos) {
            System.out.println(listaPlato.toString());//De esta forma imprimimos por pantalla el contenido. Hay que implementar el toString en la clase
        }
        
        /*Proceso de eliminacion*/
        int idEliminar = 2;
        control.eliminarPlato(idEliminar);
        
        /*Proceso de edicion*/
        int idEditar = 3; //Declaramos el id a cambiar, podemos solicitar por pantalla con scanner
        Plato platEdit = control.buscarPlato(idEditar);//Primero traemos el plato por id y despues lo editamos. BUENA PRACTICA
        platEdit.setPrecio(30.0);
        
        control.editarPlato(platEdit);
        
        
    }
}
