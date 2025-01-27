/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_7.personal;

/**
 *
 * @author S
 */
public class myEnum {
     public enum ValidValues {
        FRENOS("frenos"),HIDRA("Hidráulica"),ELECT("Eletticidad"),MOTOR("Motor");
        
        private final String value;
        
        ValidValues(String value){
        this.value = value;
        }
        
        public String getValue(){
            return value;
        }
    }  
}
