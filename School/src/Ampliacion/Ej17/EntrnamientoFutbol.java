/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4.ampli.Ej17;

/**
 *
 * @author usuario
 */
public class EntrnamientoFutbol extends Entrenamiento implements Compite {

    private String mensaje;

    public EntrnamientoFutbol() {
        this.mensaje = "Hola";
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando fútbol...");
    }

    @Override
    public void competir() {
        System.out.println("El futbolista está compitiendo en un partido");
    }
    
    public void monstrarMensaje(){
        System.out.println(this.mensaje);
    }

}
