/*
    Ejercicio 1
    -----------
    Un sistema de gestión de vehículos necesita ser desarrollado para una futura 
    implementación para una tienda de venta de autos. Se requiere utilizar para 
    su implementación tanto clases abstractas como interfaces para modelar este sistema.

    a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con 
    los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer 
    un método abstracto para calcular la antigüedad del vehiculo.

    b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con 
    métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. 
    En ambos casos, cuando se implementen en sus respectivas clases, deben 
    mostrar un mensaje de qué tipo de recarga están haciendo.

    c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la 
    interfaz Electrico. Agrega atributos específicos para los autos eléctricos, 
    como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos 
    abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

    d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e 
    implemente la interfaz Combustion. Agrega atributos específicos para las 
    camionetas de combustión, como capacidadTanque y consumoCombustible. 
    Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

    e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la 
    interfaz Combustion. Agrega atributos específicos para las motos de 
    combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos 
    de la clase abstracta y los de la interfaz.

    f) Main: En el programa principal, crea objetos de diferentes tipos de 
    vehículos (autos eléctricos, camionetas de combustión, motos de combustión) 
    y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada 
    uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía 
    o combustible según corresponda.

    g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información 
    de cada uno de ellos.

    Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año 
    actual el año de fabricación del auto. Por ejemplo: 2023 - 2018= 5 años de antigüedad
 */
package ejercicion1_collectionsclasesabstractasinterfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Creacion del ArrayList
        ArrayList<Vehiculo> transporte = new ArrayList<>();
        
        //Creacion de cada uno de los objetos, para poder acceder al metodo de la interfaz, necesitamos hacer casting
        Auto auto = new Auto(40.00, 300.00, 1, "456542", "Tesla", "Model X", 2022, 43512.00);
        transporte.add(auto);
        Camioneta camioneta = new Camioneta(70, 8.5, 2, "446432", "Ford", "Raptor", 2012, 74000.00);
        transporte.add(camioneta);
        Moto moto = new Moto(700, "Motor en linea", 3, "46232", "Yamaha", "Tracer 7 Gt", 2021, 11900.00);
        transporte.add(moto);
        
        //Mostramos informacion de cada elemento
        System.out.println("El auto de marca: "+auto.marca+" tiene una antiguedad de: "+auto.calculoAntiguedad()+ " y se esta: "+auto.cargarEnergia());
        System.out.println("La camioneta de marca: "+camioneta.marca+" tiene una antiguedad de: "+camioneta.calculoAntiguedad()+ " anios"+ " y se esta: "+camioneta.recargarCombustible());
        System.out.println("La moto de marca: "+moto.marca+" tiene una antiguedad de: "+moto.calculoAntiguedad()+" anios"+ " y se esta: "+moto.recargarCombustible());
        
        //Recorremos el array y mostramos la informacion
        for (Vehiculo vehiculo : transporte) {
            System.out.println("El vehiculo de marca: "+vehiculo.marca+" , modelo: "+vehiculo.modelo+ ", placa: "+vehiculo.placa+", y precio: "+vehiculo.costo);            
        }
        System.out.println("");
    }
    
}
