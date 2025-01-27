/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_9;

/**
 *
 * @author S
 */
public class Camion extends Vehiculo {

    int capacidadCarga;

    public Camion(String marca, String modelo, String anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDetalles(String marca, String modelo, String anio) {
        super.mostrarDetalles(marca, modelo, anio);
        System.out.println("Este camión tine una capacidad de carga es de "
                + this.capacidadCarga + "toneladas");
    }
    
     @Override
    public void mover() {
        super.mover();
        System.out.println("...en camión por Chicago");
    }
}
