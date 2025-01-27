/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_9;

/**
 *
 * @author S
 */
public class Motocicleta extends Vehiculo {
    boolean tieneSidecar;
    
     public Motocicleta(String marca, String modelo, String anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
    @Override
    public void mostrarDetalles(String marca, String modelo, String anio) {
        super.mostrarDetalles(marca, modelo, anio);
        System.out.println("¿Tiene esta motocicleta sidecar? "+this.tieneSidecar+".");
    }
    
     @Override
    public void mover() {
        super.mover();
        System.out.println("...en motocicleta por Paris");
    }
}
