
package com.mycompany.apuntes;

//Apuntes sobre POO
//Clase: Modelos donde se redactan las caracteristicas comunes de un grupo de objetos 
//Objeto: ejemplar o instancia de una clase, sus propiedades son atributos 
//el metodo constructor es un metodo que le da un estado inicial a nuestro objeto, debe de tener el mismo nombre de la clase 
// la clase principal es la que tiene el metodo main y de ahi se empieza a ejeciutar todo 
//Encapsular es dar metodos o atributos especificos a cada clase 
//Los metodos son comportamientos para interactuar
//===========================================================================================================================================
//metodo setter o definidor es para modificar alguna propiedad 
//metodo getter o captador es para establecer el valor de alguna propiedad 
//Getter:devolver el valor de las propiedaes de los objetos 
//sintaxis: public tipo_dato nombre_metodo(){}
//=================================================================================================================
//setter:modificar el valor de la propiedades de los objetos 
//sintaxis: public void nombre_metodo(){}
//void indica que el metodo no devuelve ningun valor
//static se le puede apicar a casi todo y lo vuelve una constante o metodo de clase
//asi por ejemplo puedo crear un atributo que compartan todos los objetos de una clase, y no cada objeto una copia del atributo 
// al ser estatico se llama apartir del nombre de la clase 
//--------------------------------------------------------------------------------------------------------------------------------------------------
//se puede crear varias clases constructores para dar distintos estados iniciales 
//si yo tengo un constrcutor que recibe cosas distintas con el this() puedo llamar a otro constructor
public class Poo {
    int atributo;
    //estos son los atributos de la classe 
    private double atributo2;
    //con el private lo que hice fue encapsular, es decir que este atributo solo se pude
    //modificar desde esta clase y no desde otra. tampoco se puede ver desde otra clase 
    public Poo(int atributo, double atributo2){
        //este es el metodo constructor con lo que recibe 
        //denifimos las cosas basicas 
        atributo = 23;
        atributo2 = atributo2;
    }
    public Poo(int atributo){
        this(atributo, 32.5);
        //este segundo constructor recibe menos cosas pero llama al primero y define lo anterior
    }
    public int atrubuto(){
        return atributo; //este metodo getter me devuelve el valor del atributo
    }
    public static void main(String[] args){
        Poo hola = new Poo(23,5); //aca creamos un objeto
    }
    
}
class Hola{
    public Hola(){
    }
}
//puedo crear otra clae aca mismo o en otro archivo