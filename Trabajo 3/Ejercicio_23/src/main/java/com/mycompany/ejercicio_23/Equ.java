/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_23;

/**
 *
 * @author Usuario
 */
public class Equ {
    public double a;
    public double b;
    public double c;
    
    public Equ(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        }
    
    public double discriminante(){
        return b*b-(4*a*c);
    }
    
    public String x1(){
        String no = "No tiene soluciones en los reales";
        double k = discriminante();
        
        if (k<0){
            return no;
        } else if (k==0) {
            double x = -b/(2*a);
            return "La unica solucion es " + x ;
        } else {
            double x1 = (-b + Math.sqrt(k))/(2*a);
            double x2 = (-b - Math.sqrt(k))/(2*a);
            return "Las soluciones son " + x1 + " y " + x2 ;
            
        }
    }
    
}
