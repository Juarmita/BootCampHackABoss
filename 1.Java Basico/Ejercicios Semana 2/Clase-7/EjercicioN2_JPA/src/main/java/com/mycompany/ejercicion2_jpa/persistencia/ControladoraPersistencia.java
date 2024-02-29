package com.mycompany.ejercicion2_jpa.persistencia;
import com.mycompany.ejercicion2_jpa.logica.Platillo;
import com.mycompany.ejercicion2_jpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    PlatillosJpaController platoJPA = new PlatillosJpaController();
    
    //Creacion platillos
    public void crearPlatillo(Platillo plat){
        platoJPA.create(plat);
    }
    
    //Borrado
    public void borrarPlatillo(Long id){
        try {
            platoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Platillo> traerPlatillos (){
        return platoJPA.findPlatillosEntities();
    }
    
    public void modificarPlatillo(Platillo plat){
        try {
            platoJPA.edit(plat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
