/*
    Ejercicio 1
    -----------
    Crear una aplicación para gestionar una lista de estudiantes en una base de 
    datos. Los estudiantes tendrán atributos como id, nombre, edad y calificación.

    El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar 
    la lista de todos y mostrar su información.

    Crear una base de datos mediante MySQL llamada universidad y una tabla 
    llamada estudiantes cuyas columnas coincidan con los atributos de la clase 
    estudiante.

    Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
 */

package com.mycompany.ejercicion1_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjercicioN1_JDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad"; //Esta es la url de mi base de datos
        String usuario = "root"; //Nombre de usuario por defecto
        String contraseña = "";//Sin contraseña
        
        //Excepciones para comprobar errores de conexion
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida");
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(sql);
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                float calificacion = resultado.getFloat("calificacion");
                System.out.println("ID: "+id+", Nombre: "+nombre+", Edad: "+edad+", Calificacion: "+calificacion);
            }
            
            //Cerramos conexion
            resultado.close();
            statement.close();
            conexion.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
