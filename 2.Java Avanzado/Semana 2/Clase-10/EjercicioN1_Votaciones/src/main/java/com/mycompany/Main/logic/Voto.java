package com.mycompany.Main.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private Long id;
    private String partido;
    private int votos;
    
    //Constructores

    public Voto() {
    }

    public Voto(Long id, String partido, int votos) {
        this.id = id;
        this.partido = partido;
        this.votos = votos;
    }

    

    
    
    //Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    
    
}
