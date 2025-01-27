/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_6;

/**
 *
 * @author S
 */
public class EnumTipo {

    public enum ValidValues {
        HOMBRE("hombre"), MUJER("mujer");

        private final String value;

        ValidValues(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
