//Esta es la controladora GLOBAL
package com.mycompany.cafeteria.logic;

import com.mycompany.cafeteria.persistence.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); //Generamos una instancia para usarla en el CRUD

    public void crearPlato(Plato plat1) {
        controlPersis.crearPlato(plat1);
    }

    public List<Plato> traerPlatos() {
        return controlPersis.traerPlatos();
    }

    public void eliminarPlato(int idEliminar) {
        controlPersis.eliminarPlato(idEliminar);
    }

    public Plato buscarPlato(int idEditar) {
        return controlPersis.buscarPlato(idEditar);
    }

    public void editarPlato(Plato platEdit) {
        controlPersis.editarPlato(platEdit);
    }
    
    
    
}
