/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.refuerzo.Ej2;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("qwe123","tiituloo", Genero.CIENCIA, 19);
        Direccion dirr = new Direccion("puro", "puro2", "puro3");
        Usuario user1 = new Usuario("3222111", "Juan", dirr, "nombre2", 50);
        Usuario user9 = new Usuario("3222111", "Juan", dirr, "nombre2", 50);
        Usuario user8 = new Usuario("37622001", "Juan", dirr, "nombre2", 50);
        Bibliotecario bibi = new Bibliotecario("3292111", "Juanen", dirr, "nombre3", 50);
        System.out.println(user1.equals(user8));
        System.out.println(user1.equals(user9));
       
        
        System.out.println(libro1.toString());
        user1.prestarLibro(libro1);
        System.out.println(libro1.toString());
        System.out.println(user1.toString());
        System.out.println(bibi.toString()); 
        
        Persona per1 = user1;
        Persona per2 = bibi;
        
        System.out.println(per1.obtenerTypo());
        System.out.println(per2.obtenerTypo());
        
        System.out.println(per1 instanceof Usuario);
        
        Usuario usr2 = (Usuario)per1;
        System.out.println(usr2.obtenerTypo());
        
        Persona persona3 = (Persona) user1;
        persona3.mensaje();
        
        ((Persona)user1).mensaje();
        
        
        user1.mensaje();
        
         System.out.println(persona3 instanceof Persona);
         
       Usuario user15 = (Usuario) persona3;
        
        System.out.println(persona3 instanceof Usuario); 
        System.out.println(user15.obtenerTypo()); 
        
        //System.out.println(bibi3.obtenerTypo());
     ((Usuario)persona3).prestarLibro(libro1);
     
     Biblioteca lib1 = new Biblioteca(10);
     // Esto crea una biblioteca que tiene dentro un Libro [] libro con 10 libros   
        
        
        
    }
    
}
