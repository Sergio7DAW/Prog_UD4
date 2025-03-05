/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej1;


/**
 *
 * @author usuario
 */
public class Biblioteca {

    public Libro[] libros;
    private int cantidadLibros;

    // Constructor
    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        cantidadLibros = 0;
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
        } else {
            System.out.println("La biblioteca está llena, no se pueden agregar más libros.");
        }
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (int i = 0; i < cantidadLibros; i++) {
            libros[i].mostrarInfo();
        }
    }

    // Método para prestar un libro por título
    public void prestarLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (libros[i].prestar()) {
                    System.out.println("El libro '" + titulo + "' ha sido prestado.");
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }
}


