package Modelos;

public class Cars implements IVehiculo {
    private String id;
    private String marca;
     public Cars(String id, String marca) {
         this.id = id;
         this.marca = marca;
     }
     public void encenderVehiculo(){
         System.out.println("Encendiendo vehiculo:"+ marca);
     }
}
