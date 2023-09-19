/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author Usuario
 */
public class Circulo {
    public double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    public double area(){
        return Math.PI*Math.pow(radio,2);
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }
    public String areaPerimetro(){
        double area = area();
        double perimetro = perimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
    
}
