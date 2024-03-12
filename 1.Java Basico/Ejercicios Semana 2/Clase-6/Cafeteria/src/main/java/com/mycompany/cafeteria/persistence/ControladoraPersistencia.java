package com.mycompany.cafeteria.persistence;

import com.mycompany.cafeteria.logic.Plato;
import com.mycompany.cafeteria.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    //Creamos insatncia del jpacontroller
    
    PlatoJpaController platoJpa = new PlatoJpaController();

    public void crearPlato(Plato plat1) {
        platoJpa.create(plat1);
    }

    public List<Plato> traerPlatos() {
       return platoJpa.findPlatoEntities();//Metodo que nos devuelve los elementos de la lista
    }

    public void eliminarPlato(int idEliminar) {
        try {
            platoJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Plato buscarPlato(int idEditar) {
      return platoJpa.findPlato(idEditar);
    }

    public void editarPlato(Plato platEdit) {
        try {
            platoJpa.edit(platEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
