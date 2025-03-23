/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4.Ej4_17;

/**
 *
 * @author 1DAW2425-09
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "ABC123", "Toyota", 2020, FuelType.Hybrid);
        Motorcycle moto = new Motorcycle(false, "XYZ789", "Honda", 2021, FuelType.Gasoline);
        
        //System.out.println(car.equals(car));

        System.out.println(car);
        System.out.println("Velocidad estimada: " + car.calculateSpeed() + " km/h");
        System.out.println("Próximo mantenimiento: " + car.getNextMaintenanceDate());

        System.out.println("\n" + moto);
        System.out.println("Velocidad estimada: " + moto.calculateSpeed() + " km/h");
        System.out.println("Próximo mantenimiento: " + moto.getNextMaintenanceDate());

        System.out.println("\nTotal de vehículos creados: " + Vehicle.getTotalVehicles());
       
    }
}
