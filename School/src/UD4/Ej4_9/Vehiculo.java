/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_9;

/**
 *
 * @author S
 */
public class Vehiculo {

    String marca;
    String modelo;
    String anio;

    public Vehiculo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarDetalles(String marca, String modelo, String anio) {
        System.out.println("Tu vehiculo es de la marca "+this.marca+
                " y su modelo es "+this.modelo+" del año "+this.anio+".");
    }
    
    public void mover(){
        System.out.println("Me estoy moviendo...");
    }
}
