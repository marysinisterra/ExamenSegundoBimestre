
package Examen;

public abstract class  Vehiculo {
    
    
    int numRuedas;
    int velocidadMaxima;

    public Vehiculo(int numRuedas, int velocidadMaxima) {
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }
   
     public abstract void acelerar ( );
    
}
