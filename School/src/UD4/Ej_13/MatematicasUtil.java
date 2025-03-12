/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej13;

/**
 *
 * @author usuario
 */
public class MatematicasUtil {
   
    public static final double PI = 3.141592653589793;

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo.");
        }
        return PI * radio * radio;
    }

    // Método para calcular el perímetro de un rectángulo
    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        if (largo < 0 || ancho < 0) {
            throw new IllegalArgumentException("Las dimensiones no pueden ser negativas.");
        }
        return 2 * (largo + ancho);
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular el factorial de un número
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para redondear un número a una cantidad específica de decimales
    public static double redondearDecimal(double numero, int decimales) {
        if (decimales < 0) {
            throw new IllegalArgumentException("El número de decimales no puede ser negativo.");
        }
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
