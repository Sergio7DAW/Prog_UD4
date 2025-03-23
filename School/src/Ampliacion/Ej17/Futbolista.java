/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.ampli.Ej17;

/**
 *
 * @author usuario
 */
public class Futbolista extends Deportista{
    
    public String posicion;
    public int golesMarcados;

    public Futbolista(String posicion, int golesMarcados, String nombre, int edad, String deporte) {
        super(nombre, edad, deporte);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
    }
    
    public int anotarGol() {
       return golesMarcados++;
    }

    @Override
    public String toString() {
        return super.toString()+" juega en la posición"+posicion+" y a marcado "+golesMarcados+" goles";
    
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Futbolista futbolista = (Futbolista) obj;
        return super.equals(obj)&& this.posicion.equals(futbolista.posicion) && this.golesMarcados == futbolista.golesMarcados;
    }
    
    
}
