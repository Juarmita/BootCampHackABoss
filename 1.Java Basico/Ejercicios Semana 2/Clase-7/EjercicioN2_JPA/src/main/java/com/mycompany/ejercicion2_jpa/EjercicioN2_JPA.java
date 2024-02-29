

package com.mycompany.ejercicion2_jpa;

import com.mycompany.ejercicion2_jpa.logica.Platillo;
import com.mycompany.ejercicion2_jpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class EjercicioN2_JPA {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Creamos primero un objeto platillo
        Platillo plat = new Platillo("Macarron", "Gratinado", (float) 12.25);
        
        //Llamamos al metodo crear platillo
        controlPersis.crearPlatillo(plat);
    
        //Creamos dos personas mas
        controlPersis.crearPlatillo(new Platillo( "Ternera", "Plancha", (float) 15.05));
        controlPersis.crearPlatillo(new Platillo( "Pollo", "Al horno", (float) 9.50));
        
        //Borramos el registro Ternera
        
       controlPersis.borrarPlatillo(2L);
       
       //Editamos el precio del primer platillo
       plat.setPrecio((float) 8.75);
       controlPersis.modificarPlatillo(plat);
    
       
       //Mostramos por pantalla
       List<Platillo> listaPlatillos = controlPersis.traerPlatillos();
       
        for (Platillo listaPlatillo : listaPlatillos) {
            System.out.println(listaPlatillo.toString()); 
        }
    }
    
}
