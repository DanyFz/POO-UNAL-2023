/**
* Esta clase define objetos de tipo cuadrado con un lado como atributo.
* @version 1.2/2020
*/
public class cuadrado {
    int lado; // Atributo que define el lado de un cuadrado
/**
* Constructor de la clase cuadrado
* @param lado Parámetro que define la longitud de la base de un
* cuadrado
*/
    public cuadrado(int lado) {
        this.lado = lado;
    }
/**
* Método que calcula y devuelve el área de un cuadrado como el
* lado elevado al cuadrado
* @return Área de un cuadrado
*/
    double calcularArea() {
        return lado*lado;
    }
/**
* Método que calcula y devuelve el perímetro de un cuadrado como
* cuatro veces su lado
* @return Perímetro de un cuadrado
*/
    double calcularPerímetro() {
        return (4*lado);
    }
}