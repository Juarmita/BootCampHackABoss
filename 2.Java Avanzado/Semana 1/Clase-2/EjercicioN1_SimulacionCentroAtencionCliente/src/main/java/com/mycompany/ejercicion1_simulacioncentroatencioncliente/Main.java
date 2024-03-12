/*
    Ejercicio 1
    -----------
    • Crea una simulación de un centro de atención al cliente en la que varios 
    agentes de soporte pueden atender llamadas telefónicas concurrentemente.
    • Cada agente se representa como un hilo independiente.
    • Los agentes deben recibir llamadas de clientes, resolver consultas y 
    registrar información sobre cada llamada. Utiliza hilos para simular la 
    atención concurrente de múltiples llamadas y garantizar que los agentes 
    puedan manejarlas de manera eficiente.
    • Asegúrate de controlar la concurrencia para evitar conflictos en la 
    asignación de llamadas a los agentes.
 */

package com.mycompany.ejercicion1_simulacioncentroatencioncliente;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Creamos los distintos agentes (hilos) para simular el trabajo
        
        Agente agente1 = new Agente("Atendiendo llamada", "Agente 1");
        Agente agente2 = new Agente("Resolviendo problema", "Agente 2");
        Agente agente3 = new Agente("Registrando datos", "Agente 3");
        Agente agente4 = new Agente("Finalizando llamada", "Agente 4");
        
        
        //Llamada al metodo start para iniciar los hilos
        agente1.start();
        agente2.start();
        agente3.start();
        agente4.start();
        
        //Uso del metodo join para que haya orden
        //Lo dejo comentado porque no sé si hay que usarlo en el ejercicio pero para que se vea que se puede usar
        agente1.join();
        agente2.join();
        agente3.join();
        agente4.join();
    }
}
