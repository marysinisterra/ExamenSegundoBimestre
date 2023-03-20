
package Examen;

public class Motocicleta extends Vehiculo  {
    
     boolean tieneCasco;

    public Motocicleta(boolean tieneCasco, int numRuedas, int velocidadMaxima) {
        super(numRuedas, velocidadMaxima);
        this.tieneCasco = tieneCasco;
    }
    
    @Override
    public void acelerar() {
    System.out.println("La velocidad actual de la motocicleta es:"+velocidadMaxima+"km-h");
    }
    
    
    
}
