/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public class Bibliotecario extends Persona {

    private String dni;
    protected String nombreCompleto;
    private Direccion direccion;

    public Bibliotecario(String dni, String nombreCompleto, Direccion direccion, String nombre, int edad) {
        super(nombre, edad);
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    @Override
    public String obtenerTypo() {
        return "Stuff";
    }
    
    @Override
    public String toString() {
        return "DNI "+dni+ "Nombre Full "+nombreCompleto+" dirección "+direccion.toString()+" Nombre Persona"+super.getNombre()+"Edad "+edad;
    }
}
