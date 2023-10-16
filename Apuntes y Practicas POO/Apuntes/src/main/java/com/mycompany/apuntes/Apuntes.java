
package com.mycompany.apuntes;
//java distingue entre mayusculas
//el public o private son los modificadores de acceso
//las clases y los metodos siempre van con {}, las sentencias terminan en ;
//enteros= int;entreros pequenos= short; enteros gigantes= long;
//deciamles de hasta 7 = float, de hasta 15 = double
//siempre utilizar el mejor mtipo de dato
//las constantes se declaran con final ejemplo  final souble hoa = 89; asi hoa nunca cambiara su valor
// <> mayor o menor que, != distinto, == igual que, && es el y logico
// ++, es operador de incremento, -- es operador de decremento; ambos es de a 1 unidad
// += n o -= n, es incrementyo o decremento de n unidaddes 
// api java es para ver la biblioteca e java y sus clases predefinidas 
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//las clases se organizan en paquetes
// podemos utilizar clases de nuestro paquete, siempre que no lo hagamos debemos llamar estas clases 
//para importar un paquete y todas sus clases import paquete.*
// si solo queremos importar una clase import paquete.classe
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/// entrada y salida de datos
// si un metodo es estatico tendremos que utilizar el nombre de la clase para llamarlo
// ejemplo math.pow, el metodo es pow, y la clase es math.
//Ejemplo de entrada con Scanner en codigo

import java.util.Scanner;
import javax.swing.*;

//Codigo de ejemplos 
public class Apuntes{
    public static void main(String[] args){
        final double c = 9; // esto es una constatnte, no se le puede cambiarc el valor 
        Scanner entrada = new Scanner(System.in);
        //creamos uns instancia entrada con constructor y classe Scanner, como parametro utilizamos la conzola del sistema
        //System.in es la consola del sistema en entrada 
        System.out.println("Introduzca su nombre: ");
        String nombre = entrada.nextLine();
        // nombre es la instancia con el metodo llamado, que es para introducir un string 
        // revisar la api de java de scanner
        //------------------------------------------------------------------------------------------------------------
        ///otra forma de ingresar datos es con una segunda clase
        //Clase JOptionPane
        // para esta clase sus metodos son estaticos entonces no tendremos que crear instancias
        String nombre_2 = JOptionPane.showInputDialog("Introduce tu nombre");

    }
    
}