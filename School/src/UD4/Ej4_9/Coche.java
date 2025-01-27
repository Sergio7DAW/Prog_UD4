/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_9;

/**
 *
 * @author S
 */
public class Coche extends Vehiculo {

    int numPuertas;

    public Coche(String marca, String modelo, String anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles(String marca, String modelo, String anio) {
        super.mostrarDetalles(marca, modelo, anio);
        System.out.println("Este coche tiene " + this.numPuertas + " puertas.");
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println("...en coche por Madrid");
    }

}
