/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej412;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Max", 3),
            new Gato("Whiskers", 2),
            new Pajaro("Piolín", 1)
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
        }
    }

}
