/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_7.maquinaria;

import UD4.Ej4_7.personal.Mecanico;

/**
 *
 * @author S
 */
public class Locomotora {
    String matricula;
    int potencia;
    int anoFabricacion;
    Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anoFabricacion, Mecanico mecanicaID) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = mecanico;
    }
    
    
}
