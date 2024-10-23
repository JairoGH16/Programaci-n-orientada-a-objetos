package models;

public class Triangulo implements Ishape {
    private int lado1, lado2, base;
    private int altura;
    public Triangulo(int lado1, int lado2, int base, int altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float calculaArea(){
        return (base*altura)/2;
    }
    @Override
    public float calculaPerimetro(){
        return base + lado1 + lado2;
    }
}
