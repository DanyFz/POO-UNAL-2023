/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooe3;

/**
 *
 * @author Cristian
 */
public class POOE3 {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }
}