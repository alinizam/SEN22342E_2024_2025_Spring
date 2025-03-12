/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example01.FactoryWithFunctionalConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author ali.nizam
 */
public class VehicleFactory {
    private static final Map<String, Supplier<Vehicle>> vehicleMap = new HashMap<>();

    // Register vehicle types
    static {
        vehicleMap.put("car", Car::new);
        vehicleMap.put("bike", Bike::new);
    }

    public static Vehicle getVehicle(String type) {
        Supplier<Vehicle> supplier = vehicleMap.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}
