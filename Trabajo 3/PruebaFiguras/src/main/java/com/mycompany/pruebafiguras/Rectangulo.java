/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    public double base;
    public double altura;
    public Rectangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public double area(){
        return base * altura;
    }
    public double perimetro (){
        return (2 * base) + (2 * altura);
    }
    public String areaPerimetro(){
        double area = area();
        double perimetro = perimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
    
    
}
