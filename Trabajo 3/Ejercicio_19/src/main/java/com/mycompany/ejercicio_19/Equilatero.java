/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_19;

/**
 *
 * @author felip
 */
public class Equilatero {
    public double lado;
    public double perimetro;
    public double area;
    public double altura;
    public Equilatero(double lado) {
        this.lado = lado;
        this.altura = (lado * Math.sqrt(3)) / 2;
        this.area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        this.perimetro = 3*lado;
    }
     public static void main(String[] args) {
        FORMULARIO form= new FORMULARIO();
        form.setVisible(true);
    }
}    
    