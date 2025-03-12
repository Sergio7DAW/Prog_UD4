/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej13;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Área del círculo: " + MatematicasUtil.calcularAreaCirculo(5));
        System.out.println("Perímetro del rectángulo: " + MatematicasUtil.calcularPerimetroRectangulo(10, 4));
        System.out.println("¿Es 17 primo? " + MatematicasUtil.esPrimo(17));
        System.out.println("Factorial de 5: " + MatematicasUtil.factorial(5));
        System.out.println("Redondeo de 3.141592 a 2 decimales: " + MatematicasUtil.redondearDecimal(3.141592, 2));
    }

}
