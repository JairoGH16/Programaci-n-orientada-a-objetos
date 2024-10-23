package Models;
import Models.Enums.tipo;

public class Producto {
    private int id;
    private String nombre;
    private String marca;
    private String tipo;
    private int peso;
    private int precio;

    public Producto(int id, String nombre, String marca, String tipo, int peso, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.peso = peso;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
    public int getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void leer_sobre_producto() {
        System.out.println("Producto: " + nombre + ", Marca: " + marca + ", Tipo: " + tipo + ", Peso: " + peso + " kg, Precio: " + precio);
    }
    public void agregar_al_carrito(){
        System.out.println("Producto agregado al carrito");
    }
}