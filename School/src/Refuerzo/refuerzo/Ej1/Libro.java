/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej1;

/**
 *
 * @author usuario
 */
public class Libro {
     private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true; 
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("---------------------------");
    }

    // ??????????
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        } else {
            return false;
        }
    }

    // ????????????????
    public String getTitulo() {
        return titulo;
    }
}
