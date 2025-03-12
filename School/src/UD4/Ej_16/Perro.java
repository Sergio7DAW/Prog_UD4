/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej16;

import unit4.Ej16.interfaces.Corredor;


/**
 *
 * @author usuario
 */
public class Perro extends Animal implements Corredor {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public String moverse() {
        return "Corre en cuatro patas";
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

}
