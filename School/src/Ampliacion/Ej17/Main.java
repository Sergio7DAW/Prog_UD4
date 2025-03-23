/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.ampli.Ej17;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Futbolista jugador = new Futbolista("delantero",9,"Juan",29,"Rugby");
        Futbolista jugador3 = new Futbolista("delantero",10,"Juan",29,"Rugby");
        Futbolista jugador2 = new Futbolista("defensa",1,"Paco",32,"Baloncesto");
        EntrnamientoFutbol training = new EntrnamientoFutbol();
        
        //jugador instanceOf Compite;
        ((Deportista)jugador).modificarEdad(40);
        ((Deportista)jugador2).modificarEdad(jugador2);
        
        jugador2.setDeporte("futbol");
        jugador.anotarGol();
        training.competir();
        training.entrenar();
        System.out.println(jugador.toString());
        System.out.println(jugador2.toString());
        System.out.println(jugador2 instanceof Compite);
        System.out.println(training instanceof Compite);
        System.out.println(jugador.equals(jugador2));
        System.out.println(jugador.equals(jugador3));
        training.monstrarMensaje();
      
   
          
        
        
    }
}
