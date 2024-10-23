import models.Circulo;
import models.Cuadrado;
import models.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4,5,6,5);
        Cuadrado cu = new Cuadrado(4,4,4,4);
        System.out.println("Area y perímetro del círculo: " + c.calculaArea() + ", "+ c.calculaPerimetro());
        System.out.println("Area y perímetro del triángulo: " + t.calculaArea() + ", "+ t.calculaPerimetro());
        System.out.println("Area y perímetro del cuadrado: " + cu.calculaArea() + ", "+ cu.calculaPerimetro());
    }
}