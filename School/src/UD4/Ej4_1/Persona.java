/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_1;

import UD4.Ej4_6.EnumTipo.ValidValues;

/**
 *
 * @author S
 */
public class Persona {

    public String nombre;
    private int edad;
    private double estatura;
    ValidValues tipo;

    public Persona() {
        this.nombre = "anónimo";
        setEdad(18);
        setEstatura(1.70);
        this.tipo = tipo.HOMBRE;
    }

    ;
    public Persona(String nombre, int edad, double estatura,ValidValues tipo) {
        this.nombre = nombre;
        setEdad(edad);
        setEstatura(estatura);
        this.tipo = tipo;
    }

    public Persona(String nombre, int edad, double estatura, String apellido, ValidValues tipo) {
        this.nombre = nombre + " " + apellido;
        setEdad(edad);
        setEstatura(estatura);
        this.tipo = tipo;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    ;
    
     public void setEdad(int edad) {
        if (edad > 0) { // Optional validation
            this.edad = edad;
        }
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    void saludar() {
        System.out.println("hola" + nombre);
    }

    void cumpleanos() {
        edad++;
        System.out.println(nombre + "cumplió" + edad);
    }

    void crecer(int anadir) {

        estatura = estatura + anadir;
        System.out.println(nombre + "mide" + estatura);
    }

    public double getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return String.format(nombre + " es " + tipo + " tiene " + edad + " años y mide " + estatura);

    }
}
