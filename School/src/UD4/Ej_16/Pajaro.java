/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej16;

import unit4.Ej16.interfaces.Volador;


/**
 *
 * @author usuario
 */
public class Pajaro extends Animal implements Volador {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    @Override
    public String moverse() {
        return "Vuela por el aire";
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }

}
