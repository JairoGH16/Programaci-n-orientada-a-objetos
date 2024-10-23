package models;

public class Cuadrado implements Ishape {
    private int l1, l2, l3, l4;
    public Cuadrado(int l1, int l2, int l3, int l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }
    @Override
    public float calculaArea() {
        return (l1 * l2);
    }
    @Override
    public  float calculaPerimetro(){
        return l1 + l2 + l3 + l4;
    }

}
