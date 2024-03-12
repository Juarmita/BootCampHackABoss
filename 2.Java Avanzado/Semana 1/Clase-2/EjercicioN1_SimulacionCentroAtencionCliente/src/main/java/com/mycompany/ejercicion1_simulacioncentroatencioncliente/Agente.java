package com.mycompany.ejercicion1_simulacioncentroatencioncliente;

public class Agente extends Thread{//Los agentes van a ser los hilos
    
    private String nombre;
    private String atencion;
    
    //Generamos el constructor

    public Agente() {
    }

    public Agente(String atencion, String nombre) {
        this.atencion = atencion;
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void run(){//Sobreescribimos run para definir la tarea que realiza el hilo
        
        for (int i = 0; i < 10; i++) {
            System.out.println("El "+nombre+ " está en este momento: "+atencion);
            
            //Usamoso try-catch para capturar error y simular el trabajo
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
    
}
