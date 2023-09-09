/**
* Esta clase define objetos de tipo circulo con su radio como atributo.
* @version 1.2/2020
*/
public class circulo {
    int radio; // Atributo que define el radio de un circulo
/**
* Constructor de la clase circulo
* @param radio Parámetro que define el radio de un circulo
*/
    circulo(int radio) {
        this.radio = radio;
    }
/**
* Método que calcula y devuelve el área de un circulo como pi
* multiplicado por el radio al cuadrado
* @return Área de un circulo
*/
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
/**
* Método que calcula y devuelve el perímetro de un circulo como la
* multiplicación de pi por el radio por 2
* @return Perímetro de un circulo
*/
    double calcularPerímetro() {
    return 2*Math.PI*radio;
    }
}