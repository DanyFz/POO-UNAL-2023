package com.mycompany.apuntes;
//apuntes sobre bucles
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//hay dos tipos de bucles, los determinados e indeterminados 
//indeterminados como el while o el do-while 
//determinados como el for o el for-each
// while(condicion){codigo}

import javax.swing.*;
import java.util.*;
public class Bucles {
    public static void main(String[] args){
        /*String clave = "Daniel";
        String pass = "";

        while(clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Introduzca la contraseña: ");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
        }
         System.out.println("Contraseña correcta");
         */ 
        //Ejemplo de while
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*int aleatorio = (int)(Math.random()*100); 
        //volvimos un numero double en entero con ese int
        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        int intentos = 0;
        while(numero != aleatorio){
            System.out.println("Introduce un numero:");
            numero = entrada.nextInt();
            if(numero<aleatorio){
                System.out.println("Un poco mas arriba");
            }
            else if (numero>aleatorio){
                System.out.println("Un poco mas abajo");
            }
            intentos++;
        }
        System.out.println("Adivinaste en "+ intentos + " intentos");*/
        //Otro ejemplo de while
        //-------------------------------------------------------------------------------------------------------------------------------------------
        /// Do-While
        //Do{codigo}while(condicion); aunque la condicion sea falsa el codigo se ejecuta al menos una vez
        // ejercicio para encontrar el peso ideal 
        String genero = "";
        
        do{
            genero = JOptionPane.showInputDialog("Introduzca su genero (H/M)");
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M"));
    }
    
}
