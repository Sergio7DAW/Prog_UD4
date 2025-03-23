/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public abstract class Persona {

    private String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract String obtenerTypo();
    
    public void mensaje() {
        System.out.println("Gimme danger");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona yo = (Persona) obj;
        return this.nombre.equals(yo.nombre) && this.edad == yo.edad;
    }

   
    
    
    
    
    
    

}
