/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_22;

/**
 *
 * @author Usuario
 */
public class Empleado {
    public String nombre;
    public double s_hora;
    public double horas;
    public double salario;
    public Empleado(double s_hora, double horas, String nombre) {
        this.nombre = nombre;
        this.horas = horas;
        this.s_hora = s_hora;        
    } 
    public String salarioo(){
        double salario = horas*s_hora;
        String hola = System.getProperty("line.separator");
        if(salario<450000){
           return nombre;    
        }else{
            return String.valueOf(salario)+hola + nombre;
        }   
    }
}
    


