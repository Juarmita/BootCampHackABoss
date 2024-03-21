package com.mycompany.Main.persistence;

import com.mycompany.Main.logic.Voto;
import com.mycompany.Main.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    VotoJpaController votoJPA = new VotoJpaController();//Instanciamos a Jpa controller
    
    //Intanciamos el metodo registar voto
    public void registrarVoto(Voto votos){
        votoJPA.create(votos);
    }
    
    public void eliminarVoto(Long id){
        try {
            votoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Voto> traerVotos(){//Devuelve la lista de objetos de tipo voto
        return votoJPA.findVotoEntities();    
    }
    
    public void editarVoto(Voto votos){
        try {
            votoJPA.edit(votos);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
