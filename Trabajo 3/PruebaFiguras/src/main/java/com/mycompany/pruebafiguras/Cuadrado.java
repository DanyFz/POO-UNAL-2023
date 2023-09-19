/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author Usuario
 */
public class Cuadrado {
    public double lado;
    public Cuadrado (double lado) {
        this.lado = lado;
    }
    public double area (){
        return lado*lado;
    }
    public double perimetro () {
        return (4*lado);
    }
    public String areaPerimetro(){
        double area = area();
        double perimetro = perimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
}
