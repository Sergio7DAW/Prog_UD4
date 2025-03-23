/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public class Test {  
    public static void modificarEjemplares(Libro l, int nuevoValor) {  
        l = new Libro("Nuevo ISBN", "Título nuevo", Genero.NOVELA, 5);  
        nuevoValor = 10;  
    }  

    public static void main(String[] args) {  
        Libro libro = new Libro("123", "Cien años de soledad", Genero.NOVELA, 3);  
        int valor = 7;  
        modificarEjemplares(libro, valor);  
        System.out.println(libro.getEjemplaresDisponibles() + " | " + valor);  
        
        
    }  
}  
