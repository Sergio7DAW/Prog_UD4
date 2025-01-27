/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculadora;

import java.util.Scanner;


public class Caculadora {

    /*
    *Aquí aparecen palabras reservadas
    *como "public", "static" o "void"
    */
    
    public static void main(String[] args) {
       correrCalculadora();
    }
    
    public static void correrCalculadora(){
     Scanner sc = new Scanner(System.in);
        // declaramos e inicializamos la variable a,b y resultado
        double a = 0, b = 0, resultado = 0;
        String opciones;

        System.out.println("Por favor introduce números positivos, que no sean 0");
        System.out.println();
        System.out.println("Operaciones disponibles:");
        System.out.println("+, -, *, /, raiz");
        System.out.println("valorabs, logaritmo, funcionexp, seno, coseno");
        System.out.println("tangente, arcosen, arcotang, redondeo");
        System.out.println("acumulador, Fibonacci, Mayor");
        System.out.println("SALIR -> pulse s");
        System.out.println();
        //Ejemplo bucle do-while
        do {
            System.out.print("¿Qué deseas calcular? ");
            opciones = sc.nextLine();

            // Ejemplo de condicional doble
            if (opciones.equalsIgnoreCase("s")) {
                System.out.println("fin");
                break;
            }

            if ("+-*/Mayor".contains(opciones)) {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                System.out.print("Introduce otro número: ");
                b = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea
            } else {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea
            }
            // Ejemplo de uso de switch como expresión
            switch (opciones) {
                case "+" -> resultado = suma(a, b);
                case "-" -> resultado = resta(a, b);
                case "*" -> resultado = multiplica(a, b);
                case "/" -> resultado = division(a, b);
                case "raiz" -> resultado = Math.sqrt(a);
                case "valorabs" -> resultado = Math.abs(a);
                case "logaritmo" -> resultado = Math.log(a);
                case "funcionexp" -> resultado = Math.exp(a);
                case "seno" -> resultado = Math.sin(a);
                case "coseno" -> resultado = Math.cos(a);
                case "tangente" -> resultado = Math.tan(a);
                case "arcosen" -> resultado = Math.asin(a);
                case "arcotang" -> resultado = Math.atan(a);
                case "redondeo" -> resultado = Math.round(a);
                case "acumulador" -> resultado = acumulador(a);
                case "primo" -> {
                    // conversión de tipo explícita
                    primos((int)a);
                }
                case "Fibonacci" -> {
                    // Ejemplo de llamada a la función
                    hastaFibonacci((int) a);
                    
                }
                case "Positivo" -> {
                    System.out.println(esPositivo(a));
                }
                case "Mayor" -> {        
                    System.out.println("Es mayor: " + esMayor(a,b));
                    resultado = 0;
                }
                default -> resultado = 0;
            }

            if (resultado != 0) {
                System.out.println("Resultado: " + resultado);
            }

        } while (!opciones.equalsIgnoreCase("s"));
    }

    public static double suma(double a, double b) {
        // ejemplo de operadores aritméticos
        return a + b;
    }

    //Ejemplo de función
    public static double resta(double a, double b) {
        //ejemlo de return en una función
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        // ejemplo de operadores lógicos
        if (a != 0 && b != 0) {
            return a / b;
        }
        System.out.println("Error: División por cero.");
        return 0;
    }

    public static double acumulador(double a) {
        double sumador = 0;
        final double EULER = Math.E;
        for (double i = 0; i <= 10; i += 0.87) {
            sumador += EULER * a;
        }
        return sumador;
    }

    public static void hastaFibonacci(int a) {
        int elPrimero = 0, elSegundo = 1, siguiente;
        System.out.println("Los números de la serie Fibonacci hasta " + a + " son: ");
        while (elPrimero < a) {
            System.out.print(elPrimero + " ");
            siguiente = elPrimero + elSegundo;
            elPrimero = elSegundo;
            elSegundo = siguiente;
        }
        System.out.println();
    }

    public static double esMayor(double a, double b) {
        return a > b?a:b;
    }
    
    public static boolean esPositivo(double a) {
        return a>=0;
    }
    
    public static void primos(int x) {
        int num = x;
        if (x > 2) {

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    // Ejemplo de salida anticipada break
                    System.out.println("no es primo");
                    break;
                } else {
                    System.out.println("es primo");
                    break;
                }
            }
        }
    }
}
