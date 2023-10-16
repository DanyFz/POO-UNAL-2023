/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4._1;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente extends Cuenta {
    float sobregiro;
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa); 
        sobregiro = 0; 
    }
    
}
