/*
    Ejercicio Nº 4: Simulación de un Cajero Automático 
    Crear una simulación de un cajero automático en la que varios usuarios pueden 
    realizar operaciones bancarias concurrentemente sobre una misma cuenta compartida.
    Cada usuario debe ser representado por un hilo diferente. Los hilos deben 
    ser capaces de realizar operaciones como depósitos, retiros y consultas de 
    saldo en una misma cuenta bancaria compartida. Utiliza sincronización y 
    control de concurrencia para garantizar que las operaciones se realicen de 
    manera segura y que el saldo de la cuenta se mantenga correctamente.
    Tareas a realizar: 
    a)Crear una clase llamada CuentaBancaria con el atributo: saldo y los métodos: 
    depositar (aumenta el saldo) y retirar (resta el saldo, verificar que el monto 
    sea mayor o igual al saldo).
    b)Crear la clase CajeroAutomatico con los atributos: cuenta 
    (del tipo CuentaBancaria y nombre, la clase debe implementar la interface Runnable. 
    En el método run() colocar un bucle for para simular N operaciones depositar 
    y/o retirar, usar un número Random el monto de la operación y otro para generar 
    un depósito o un retiro, mostrar por consola que operación se realizó y el monto.
    c)En el método main:
        -Crear un objeto CuentaBancaria.
        -Crear 2 hilos (representar los cajeros automáticos) con el nombre “Cajero 1” 
        y “Cajero 2” a cada uno de ellos pasar en el constructor la cuenta bancaria, 
        luego iniciar ambos hilos y analizar su comportamiento.
    d)En CajeroAutomatico, agregar lo necesario para SINCRONIZAR la concurrencia 
    entre hilos.
 */

package com.mycompany.Main;

public class EjercicioN3_SimulacionCajero {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
