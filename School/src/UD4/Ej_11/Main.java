/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej11;

/**
 *
 * @author usuario
 */
public class Main {
      public static void main(String[] args) {
        // Creación de objetos Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148410-0", 1605);
        Libro libro3 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "978-0-14-303809-2", 1985);
        
        // Imprimir los libros usando el método toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        // Comparar libros con el mismo ISBN
        System.out.println("\n¿Los libros 1 y 2 son iguales? " + libro1.equals(libro2)); // Debería devolver true (mismo ISBN)

        // Comparar libros con diferentes ISBN
        System.out.println("¿Los libros 1 y 3 son iguales? " + libro1.equals(libro3)); // Debería devolver false (diferente ISBN)
    }
}
