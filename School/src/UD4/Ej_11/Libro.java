/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.Ej11;

/**
 *
 * @author usuario
 */
public class Libro {
  

    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

   
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

   
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }

    
    @Override
    public boolean equals(Object obj) {
        // Verificamos si el objeto es el mismo
        if (this == obj) {
            return true;
        }

        // Verificamos si el objeto es de la misma clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Convertimos el objeto a un Libro y comparamos los ISBN
        Libro libro = (Libro) obj;
        return this.isbn.equals(libro.isbn);
    }
}