/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_2;

import UD4.Ej4_1.Persona;
import UD4.Ej4_6.EnumTipo;

/**
 *
 * @author S
 */
public class Fiesta {

    public static void main(String[] args) {
        Persona juan = new Persona("Juan");
        Persona pepe = new Persona("Pepe",29,1.90,"Perez", EnumTipo.ValidValues.HOMBRE);
        Persona paco = new Persona();

        //Esto antes mostraba la referencia,
        //pero cambié el toString método
        //para que sea como un mostrarDatos()
        System.out.println(juan);
        System.out.println(pepe);
        System.out.println(paco);
        //juan.nombre = "Juan";
        //System.out.println(juan.nombre);
        //juan.setEdad(9);
        //System.out.println(juan.getEdad());
        
        

    }

}
