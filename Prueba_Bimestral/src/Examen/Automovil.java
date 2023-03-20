
package Examen;

public class Automovil extends Vehiculo {
    
    int numPuertas;

    public Automovil (int numRuedas,int velocidadMaxima,int numPuertas) {
        super(numRuedas,velocidadMaxima);
        this.numPuertas = numPuertas;
    }
    
    @Override
    public void acelerar() {
      System.out.println("La velocidad actual del automovil es:"+velocidadMaxima+"km-h");
      
    }
    
    
}
