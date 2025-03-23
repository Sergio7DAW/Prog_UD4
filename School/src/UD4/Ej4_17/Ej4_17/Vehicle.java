/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_17;

import java.util.Objects;

/**
 *
 * @author 1DAW2425-09
 */
public abstract class Vehicle {

    protected String licensePlate;
    protected String brand;
    protected int year;
    protected FuelType fuelType;
    protected static int vehicleCount = 0;

    public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++;
    }

    public abstract double calculateSpeed();
    
    public String getVehicleInfo(String info) {
        String info2 = "";
        return info2;
    }
    
     public String getMatricula() {
        return licensePlate;
    }

    public void setMatricula(String matricula) {
        this.licensePlate = matricula;
    }

    public String getMarca() {
        return brand;
    }

    public void setMarca(String marca) {
        this.brand = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    ;
    /*
     public void nextMaintenanceDate(String date) {
        System.out.println("date");
    }*/

    ;
     
     public static int getTotalVehicles() {
        return vehicleCount;
    }

    ;

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return year == vehicle.year &&
                Objects.equals(licensePlate, vehicle.licensePlate) &&
                Objects.equals(brand, vehicle.brand) &&
                fuelType == vehicle.fuelType;
    }

     @Override
    public String toString() {
        return "Vehículo: " + brand + " [" + licensePlate + "], Año: " + year + ", Combustible: " + fuelType;
    }

}
