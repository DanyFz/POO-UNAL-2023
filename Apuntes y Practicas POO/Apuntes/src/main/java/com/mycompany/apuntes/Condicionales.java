package com.mycompany.apuntes;
///Apuntes sobre condicionales y bucles
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//estos pueden cambiar el flujo de jecución del programa
//esto quiere decir que podemos saltar lineas de codigo o repetir lineas de codigo, es decir if y bucles
//el condicional  if(condicon){codigo}
//swiitch (valor a evaluar) {
    //caso a evaluar 1:
      //codigo
      //break

//} asi funciona con varios casos
import java.util.*;
import javax.swing.*;
public class Condicionales{
    public static void main(String[] args){
        //Ejemplo de switch
        //el ejercio consta de hallar el area de varias figuras geometricas
        Scanner entrada = new Scanner(System.in); //entrada con el constructor Scanner
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Tríangulo \n4: Circulo"); 
        //El \n me da un salto de linea
        int figura = entrada.nextInt(); //una variable con el entero que se introduzca

        switch (figura){
            case 1:
             // caso en que figura valga 1
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
                break;
                //siempre se debe finalizar un case con un break
            case 3:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del Tríangulo es: " + (base*altura)/2);
                break;
            case 2: 
                int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del Rectangulo es: " + (lado1*lado2));   
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:")); 
                System.out.print("El área del Circulo es: ");
                //con este print no dejamos salto de linea definido
                System.out.printf("%1.2f", Math.PI*Math.pow(radio, 2));
                //Este es un print con formato, esto para que el area del circulo quee con pocos decimales
                //Esto me asegura dos decimales, %1.2f
                break;  
            default:
             //este es el equivalente al else del switch  
             System.out.println("La opción no es correcta.");          
        }
    }
}