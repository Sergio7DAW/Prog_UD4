/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public class Libro {
    private String ISBN;
    String titulo;
    Genero genero;
    public int ejemplaresDisponibles;
    static int totalPrestamos = 0;

    public Libro(int ejemplaresDisponibles) {
    this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    
    
    public Libro(String ISBN, String titulo, Genero genero, int ejemplaresDisponibles) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.genero = genero;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
    public Libro(String titulo, Genero genero, int ejemplaresDisponibles) {
        this.ISBN = "Ninguno";
        this.titulo = titulo;
        this.genero = genero;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }


    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "ISBN: "+ISBN+" Título: "+titulo+" Género: "+genero+" Ejemplares Disponibles: "+ejemplaresDisponibles;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }
   
    
    
    
    
}
