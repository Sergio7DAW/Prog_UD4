/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej16;

import unit4.Ej16.interfaces.Nadador;

/**
 *
 * @author usuario
 */
public class Pez extends Animal implements Nadador {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Glub glub");
    }

    @Override
    public String moverse() {
        return "Nada en el agua";
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}
