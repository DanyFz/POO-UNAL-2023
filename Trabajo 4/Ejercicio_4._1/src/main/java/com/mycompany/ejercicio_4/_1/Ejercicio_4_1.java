
package com.mycompany.ejercicio_4._1;


import java.util.*;
public class Ejercicio_4_1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Cuenta de ahorro");
       System.out.println("Ingrese saldo inicial= $");
       float saldoInicialAhorros = input.nextFloat(); 
       System.out.print("Ingrese tasa de interés= ");
       float tasaAhorros = input.nextFloat();
       CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
       System.out.print("Ingresar cantidad a consignar: $");
       float cantidadDepositar = input.nextFloat();
       cuenta1.consignar(cantidadDepositar);
       System.out.print("Ingresar cantidad a retirar: $");
       float cantidadRetirar = input.nextFloat();
       cuenta1.retirar(cantidadRetirar);
       cuenta1.extractoMensual();
       cuenta1.imprimir();

    }
}
