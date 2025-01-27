/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_7;

import UD4.Ej4_7.maquinaria.*;
import UD4.Ej4_7.personal.*;

/**
 *
 * @author S
 */
public class Main {
     public static void main(String[] args) {
        Maquinista Paco = new Maquinista("Paco Sanchez", "098777765Z", 3000, "Jefe de Equipo");
        Locomotora Loco = new Locomotora("12344Y", 123, 222, new Mecanico("Juan Perez", 34567844, myEnum.ValidValues.FRENOS));
        Vagones vagon1 = new Vagones(12, 50, 35, "pescado");
        Vagones vagon2 = new Vagones(13, 50, 35, "fruta");
        Vagones vagon3 = new Vagones(14, 50, 35, "carne");
        Vagones vagon4 = new Vagones(15, 50, 35, "pollo");
        Vagones vagon5 = new Vagones(16, 50, 35, "verdura");
        
        Trenes tren = new Trenes(Paco, Loco);
        
        tren.engancharVagones(vagon5);
        tren.engancharVagones(vagon3);
        tren.engancharVagones(vagon1);
        tren.quitarVagones(1);
        
        
        
    }
}
