package models;

public class Circulo implements Ishape {
    private int radius;
    public Circulo(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculaArea(){
        return 3.14f * (radius * radius);
    }
    @Override
    public float calculaPerimetro(){
        return 2 * radius;
    }

}
