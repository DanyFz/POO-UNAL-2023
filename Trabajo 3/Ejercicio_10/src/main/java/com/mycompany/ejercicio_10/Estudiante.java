/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_10;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    public int inscripcion;
    public String nombre;
    public double patrimonio;
    public double estrato;
    public Estudiante (int inscripcion, String nombre, double patrimonio, double estrato) {
        this.estrato = estrato;
        this.inscripcion = inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
    }
    
    public String pago(){
        if (estrato>3 && patrimonio>2000000){
            double incremento= (patrimonio*3)/100;
            double pago = 50000+incremento;
            return  inscripcion + ", " + nombre + ", " + pago;
        } else {
           return inscripcion + ", " + nombre + ", 50000";
        }
    }
    
}
    

