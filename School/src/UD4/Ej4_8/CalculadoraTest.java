package UD4.Ej4_8;

/**
 *
 * @author S
 */

import caculadora.Caculadora;
import calcu2.Calcu2;
        
public class CalculadoraTest {
    public static void main(String[] args) {
        //Version 1
        Caculadora.correrCalculadora();
        
        System.out.println(" ");
        //Version 2
        Calcu2.setA(12.3345);
        Calcu2.setB(9.10928);
        Calcu2.division();
    }
}
