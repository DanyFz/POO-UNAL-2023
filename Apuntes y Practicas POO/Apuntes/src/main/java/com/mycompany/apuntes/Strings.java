package com.mycompany.apuntes;

public class Strings {
    public String stringEjemplos(){
        //Metodo que devulelve strings y que se llama stringEjemplos
        // Como manipular cadenas String
        //en java no existe el tipo string, existe la clase String, no es un primitivo
        // asi cuando declaramos una variable la hacemos como tipo objeto
        String hola = "hola";
        //hola es una instancia de la clase String
        //hola.length() me devuelve la longitud de hola
        //charAt() me devuelve la letra segun la posicion que intyroduzca en el parentesis, la posicion se empieza a contar desde el 0
        //hola.substring(x,y) x es el caracter donde inicia y Y el carcater que no queremos extraer, es decir y-1 es hasta donde ira el sub
        // equals(cadena) compara cadenas de texto y devuelve true si son iguales, tiene en cuenta mayus
        //hola.equalsIgnoreCase(hola) esta no tiene en cuenta las mayus
        return hola;
        
    }

    
}
