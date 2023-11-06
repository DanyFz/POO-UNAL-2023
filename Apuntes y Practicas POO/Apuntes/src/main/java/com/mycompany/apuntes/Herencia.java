
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
    public void hola(){
        Poo[] poo = new Poo[2];
        //creamos una array que me recibe objetos tipo poo
        poo[0] = new Poo(6,8);
        poo[1] = new Herencia(6,8);
        //Ejemplo de polimorfismo o principio de sustitucion
        //Podemos meter un objeto de herencia porque esta hereda de poo
        Herencia heredero = (Herencia) poo[1];
        //esto es un castig, ahora estamos asignando el objeto en especifico
        //no lo podriamos hacer con Poo[0] porque este no es un objeto de herencia sino de poo
        // y como se establecio el codigo uno objeto de herencia es de poo pero no al reves 
    }
    //*-------------------------------------------------------------------------------------------------------------
    //Metodos y Clases Final 
    // Si yo creo una clase final nadie mas podra heredar de esa clase 
    //final class nombre.... esta es la structura
    //Un metodo final es un metodo que no se puede sobreescribir en las subclases, es decir que no es modificable 
}
