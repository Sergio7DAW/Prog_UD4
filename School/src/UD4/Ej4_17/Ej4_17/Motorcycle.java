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
public class Motorcycle extends Vehicle implements Maintenance{

    private boolean hasSidecar;

    public Motorcycle(boolean hasSidecar, String licensePlate, String brand, int year, FuelType fuelType) {
        super(licensePlate, brand, year, fuelType);
        this.hasSidecar = hasSidecar;
    }
    
     public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

     @Override
    public double calculateSpeed() {
        return 150.0;
    }

    @Override
    public LocalDate getNextMaintenanceDate() {
        return LocalDate.now().plusMonths(4);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Moto, Sidecar: " + (hasSidecar ? "Sí" : "No");
    }

}
