package com.mycompany.apuntes;
///Apuntes sobre Arrays/Matrices/Listas.
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Una matriz es una estructura de datos con valores del mismo tipo
 // Declaracion int[] matriz = new int[10]; ejemplo de matriz int es el tipo de dato y 10 el numero de datos
//el tipo de dato de la array puede ser un objeto, Objeto[] objeto= new Objeto[]
public class Arrays{
    public static void main(String[] args){
        /*int[] matriz = new int[5];
        int matriz1[] = new int[5]; //otro metodo
        matriz[0]=1; //definimos el primer valor de la matriz commo 1*/
        /*String paises[] = new String[3];
        paises[0]= "Colombia";
        paises[2]= "Colom";
        paises[1]= "bia";
        //Vamos a utilizar el for each que es para matrices
        for(String elemento:paises){
            System.out.println(elemento);
        }*/
        int matriz[] = new int[150];
        for(int i=0; i<matriz.length;i++){
            matriz[i]= (int)(Math.random()*100);
        }
        for(int n:matriz){
            System.out.println(n);
        }


    }
}