/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_4;

import java.util.Scanner;

/**
 *
 * @author S
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora (HH)");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos (MM)");
        int minuto = sc.nextInt();
        System.out.println("Introduce los segundos (SS)");
        int segundo = sc.nextInt();

        Hora tiempo = new Hora(hora, minuto, segundo);

        System.out.println("Introduce la cantidad de segundos adicionales a mostrar:");
        int n = sc.nextInt();

        System.out.println("Tiempo actual es: " + tiempo);

        for (int i = 0; i < n; i++) {
            tiempo.pasaTiempo();
            System.out.println(tiempo);
        }
    }

}
