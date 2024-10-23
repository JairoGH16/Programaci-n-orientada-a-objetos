package Models;

public class Carrito {
    private String color;
    private String tamaño;
    private int ruedas;
    private int compartimientos;

    public Carrito(String color, String tamaño, int ruedas, int compartimientos) {
        this.color = color;
        this.tamaño = tamaño;
        this.ruedas = ruedas;
        this.compartimientos = compartimientos;
    }
    public String getColor() {
        return color;
    }
    public String getTamaño() {
        return tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void empujar_carrito() {
        System.out.println("El carrito se empuja");
    }
    public void girar_carrito() {
        System.out.println("El carrito se gira");
    }
}