/**
* Método main que crea un círculo, un rectángulo, un cuadrado y
* un triángulo rectángulo. Para cada uno de estas figuras geométricas,
* se calcula su área y perímetro.
*/


public class pruebafiguras {

    public static void main(String args[]) {
        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1,2);
        cuadrado figura3 = new cuadrado(3);
        triangulorectangulo figura4 = new triangulorectangulo(3,5);
        System.out.println("El área del círculo es = " + figura1.
        calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.
        calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
        calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
        calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
        calcularperimetro());
        figura4.determinartipotriangulo();
    }
}