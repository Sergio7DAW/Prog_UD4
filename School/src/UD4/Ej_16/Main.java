/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej16;

import unit4.Ej16.interfaces.*;

/**
 *
 * @author usuario
 */
public class Main {
 public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Max", 3),
            new Gato("Whiskers", 2),
            new Pajaro("Piolín", 1),
            new Pez("Nemo", 1)
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
        }

        // Usar las capacidades adicionales mediante polimorfismo
        Corredor[] corredores = {
            new Perro("Max", 3),
            new Gato("Whiskers", 2)
        };

        for (Corredor corredor : corredores) {
            corredor.correr();
        }

        Volador[] voladores = {
            new Pajaro("Piolín", 1)
        };

        for (Volador volador : voladores) {
            volador.volar();
        }

        Nadador[] nadadores = {
            new Pez("Nemo", 1)
        };

        for (Nadador nadador : nadadores) {
            nadador.nadar();
        }
    }

}
