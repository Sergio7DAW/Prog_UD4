/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej1;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        // Creando libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);

        /*
        // Creando la biblioteca
        Biblioteca biblioteca = new Biblioteca(10);

        // Agregando libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrando libros en la biblioteca
        biblioteca.mostrarLibros();

        // Intentando prestar un libro
        biblioteca.prestarLibro("1984");

        // Mostrando libros nuevamente para verificar el cambio de estado
        biblioteca.mostrarLibros();
         */
       Biblioteca biblioteca = new Biblioteca(10); 
        //System.out.println(biblioteca.libros.length);
        biblioteca.agregarLibro(libro2);
        biblioteca.prestarLibro("1984");
       
    }
}
