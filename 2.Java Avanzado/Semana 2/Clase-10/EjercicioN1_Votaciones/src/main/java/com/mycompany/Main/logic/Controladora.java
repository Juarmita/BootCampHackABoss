package com.mycompany.Main.logic;

import com.mycompany.Main.persistence.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    //Instanciamos a la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void registrarVoto(Voto votos) {
        
        controlPersis.registrarVoto(votos);
    }
    
    public void eliminarVoto(Long id) {
        controlPersis.eliminarVoto(id);
    }
    
    public List<Voto> traerVotos() {
        return controlPersis.traerVotos();
    }
    
    public void editarVoto(Voto votos) {
        controlPersis.editarVoto(votos);
    }
    
}
