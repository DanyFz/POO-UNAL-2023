/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apuntes;

/**
 *
 * @author Usuario
 */
public class Herencia extends Poo {
    public double a;
    public int b;
    //si el padre no tiene constructor por defecto tengo que crear un contructor para la nueva clase 
    public Herencia(double a, int b){
        super(b, a);
        //con el super estoy llamando al constructor de la clase padre 
    }
}
