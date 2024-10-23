package Models;

public class Empleado {
    private int id;
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    public Empleado(int id, String nombre, String apellido){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public int getId(){
        return id;
    }
    public int getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void limpiar(){
        System.out.println("Empleado " + nombre + " limpiando...");
    }
    public void ordenar(){
        System.out.println("Empleado " + nombre + " ordenando...");
    }
}