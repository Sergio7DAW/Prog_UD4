/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.ampli.Ej17;

/**
 *
 * @author usuario
 */
public class Deportista {

    private String nombre;
    private int edad;
    private String deporte;
    private static int totalDeportistas;

    public Deportista(String nombre, int edad, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        totalDeportistas++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getTotalDeportistas() {
        return totalDeportistas;
    }

    public void modificarEdad(int edad) {
        edad = 9; // no afecta a la variable original
    }

    public void modificarEdad(Deportista deportista) {
        deportista.setEdad(49); // modifica el objeto original
    }

    @Override
    public String toString() {
        return nombre + " practica" + deporte + ", tiene " + edad + "años, ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Deportista deportista = (Deportista) obj;
        return this.nombre.equals(deportista.nombre) && this.deporte.equals(deportista.deporte) && this.edad == deportista.edad;

    }

}
