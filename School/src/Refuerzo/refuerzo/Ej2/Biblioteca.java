/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public class Biblioteca {

    Libro[] libros;
    int numerLibros;

    //String libros que pasa con el nombre del Array de libros???
    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        numerLibros = 0;
        //Biblioteca newLibrary = new Biblioteca(5);
    }

    public void agregarLibros(Libro libro) {
        if (numerLibros < libros.length) {

            libros[numerLibros] = libro;

            numerLibros++;

        } else {
            System.out.println("no");

        }

    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void prestarLibro(String titulo) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].titulo.equalsIgnoreCase(titulo)) {
                System.out.println("prestando " + libros[i].titulo);
            } else {
                System.out.println("no se ecunetra " + titulo);
            }
        }

    }

}
