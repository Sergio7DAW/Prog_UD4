/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_4;

/**
 *
 * @author S
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    // Mis constructores
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Mis métodos set/get
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if (hora >= 0 && hora < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("El minuto debe estar entre 0 y 59");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if (hora >= 0 && hora < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 59");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    // Mi método para avanzar eltiemep
    public void pasaTiempo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }

    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        //return "La hora es "+hora+":"+minuto+":"+segundo;
    }

}
