/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_17;

import java.time.LocalDate;

/**
 *
 * @author 1DAW2425-09
 */
public final class Car extends Vehicle implements Maintenance{

    private int numberOfDoors;

    public Car(int numberOfDoors, String licensePlate, String brand, int year, FuelType fuelType) {
        super(licensePlate, brand, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumPuertas() {
        return numberOfDoors;
    }

    public void setNumPuertas(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateSpeed() {
        return 180.0;
    }

    @Override
    public LocalDate getNextMaintenanceDate() {
        return LocalDate.now().plusMonths(6);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Coche, Puertas: " + numberOfDoors;
    }

}
