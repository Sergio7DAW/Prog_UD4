/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_5;

/**
 *
 * @author S
 */
public class ContadorObjetos {

    static int totalObjetos = 0;

    public ContadorObjetos() {
        totalObjetos++;
    }

    public static void TotalObjetos() {
        System.out.println("Total objetos creados: "+totalObjetos);
    }
}
