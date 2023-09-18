/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_7;

/**
 *
 * @author Usuario
 */
public class Mayor {
    public  double a;
    public double b;
    
    public Mayor (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public String calculo(){
        if(a<b){
            return "A es menor que B";
        } else if (a>b){
            return "A es mayor que B"; 
        } else {
            return "A es igual que B";
        }
    }
}
