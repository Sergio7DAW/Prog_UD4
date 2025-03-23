/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

import unit4.refuerzo.Ej2.Libro;

/**
 *
 * @author usuario
 */

//herencia extends Persona
public class Usuario extends Persona implements Notificable{
    private String dni;
    protected String nombreCompleto;
    private Direccion direccion; //composición

    public Usuario(String dni, String nombreCompleto, Direccion direccion, String nombre, int edad) {
        super(nombre, edad);
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    
    
    public void prestarLibro(Libro libro) {
       //Libro libro1 = new Libro(9);
       if (libro.ejemplaresDisponibles == 0) {
        System.out.println("no se puede prestar "+libro.titulo);
    } else {
       System.out.println("se esta prestando "+libro.titulo);
       libro.ejemplaresDisponibles--;
       Libro.totalPrestamos++;
       }
    }

    @Override
    public String obtenerTypo() {
            return "Lector";
    }

    @Override
    public void notificarPrestamo(String mensaje) {
        System.out.println("Notificación para"+ super.getNombre()+" : "+mensaje);
    }

    @Override
    public String toString() {
        return "DNI "+dni+ "Nombre Full "+nombreCompleto+" dirección "+direccion.toString()+" Nombre Persona"+super.getNombre()+"Edad "+edad;
    }
    
    public void mensaje() {
        System.out.println("Gimme Peace");
    }

    @Override
    public boolean equals(Object obj) {
        if  (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario jimbo = (Usuario) obj;
        return super.equals(obj) && this.nombreCompleto.equals(jimbo.nombreCompleto) 
                && this.dni.equals(jimbo.dni) && this.direccion.equals(jimbo.direccion);
    }
    
    
    
    
}
