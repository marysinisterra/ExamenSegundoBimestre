
package Examen;

public class PruebaVehiculo {
    
   public static void main(String[] args) {
    Vehiculo[] vehiculos = new Vehiculo[4];
    vehiculos[0] = new Automovil(4,180,3);
    vehiculos[1] = new Motocicleta (true,2,150);
    vehiculos[2] = new Automovil(4,110,4);
    vehiculos[3] = new Motocicleta(false,2,120);
  for (Vehiculo v : vehiculos) {
        if (v instanceof Motocicleta ) {
           v.acelerar();
        }
    }
   }
}
 



