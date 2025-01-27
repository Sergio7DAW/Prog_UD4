/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_9;

/**
 *
 * @author S
 */
public class Main {
    public static void main(String[] args) {
        Coche bmw = new Coche ("BMW", "M4", "2024", 4);
        Motocicleta kawa = new Motocicleta ("Kawasaki", "Ninja", "2023", false);
        Camion isu = new Camion ("Isuzu","Enterprise", "2021", 30);
        
        bmw.mostrarDetalles(bmw.marca, bmw.modelo, bmw.anio);
        kawa.mostrarDetalles(kawa.marca, kawa.modelo, kawa.anio);
        isu.mostrarDetalles(isu.marca, isu.modelo, isu.anio);
        
        bmw.mover();
        kawa.mover();
        isu.mover();
    }
}
