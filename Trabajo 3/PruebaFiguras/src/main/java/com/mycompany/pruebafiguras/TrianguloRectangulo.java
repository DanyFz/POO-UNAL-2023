/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author Usuario
 */
public class TrianguloRectangulo {
    public double base;
    public double altura;
    public TrianguloRectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public double area() {
        return (base * altura / 2);
    }
    public double hipotenusa (){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    public double perimetro (){
        return (base + altura + hipotenusa()); 
    }
    public String tipoTriangulo() {
        if ((base == altura) && (base == hipotenusa()) && (altura == hipotenusa())){
           return "Es un triángulo equilátero";
        }
        else if ((base != altura) && (base != hipotenusa()) && (altura != hipotenusa())){
            return "Es un triángulo escaleno";
        }
        else {
            return "Es un triángulo isósceles";
        }     
    }
    public String areaPerimetro(){
        double area = area();
        double perimetro = perimetro();
        String tipo = tipoTriangulo();
        double hipo = hipotenusa();
        return "su area es " + area + ", su perimetro es " + perimetro +", su hipotenusa es " + hipo + ", y " + tipo;
    }
    
}
