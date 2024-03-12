package com.mycompany.Main;

public class CuentaBancaria {

    //Atributos
    private Double saldo;
    private Double ingreso;

    //Constructores
    public CuentaBancaria() {
    }

    public CuentaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    //metodos
    public double depositar(double saldo, double ingreso) {
        return saldo = saldo + ingreso;
    }
}
