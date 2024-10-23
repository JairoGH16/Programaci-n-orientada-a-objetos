package Models;

public class Supermercado {
    private int id;
    private String nombre;
    private String ubicacion;
    private int numero_telefono;
    private int pasillos;
    private String tamaño;
    public Supermercado(int id, String nombre, String ubicacion, int numero_telefono, int pasillos, String tamaño) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numero_telefono = numero_telefono;
        this.pasillos = pasillos;
        this.tamaño = tamaño;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public int getNumero_telefono() {
        return numero_telefono;
    }
    public int getPasillos() {
        return pasillos;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }
    public void setPasillos(int pasillos) {
        this.pasillos = pasillos;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void abrir_supermercador() {
        System.out.println("El supermercado " + nombre + " se ha abierto.");
    }
    public void cerrar_supermercado() {
        System.out.println("El supermercado " + nombre + " se ha cerrado.");
    }
}