/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej10;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);

        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}
