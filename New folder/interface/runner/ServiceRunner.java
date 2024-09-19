package com.xworkz.services.runner;

import com.xworkz.services.*;
import com.xworkz.services.implimentation.*;

public class ServiceRunner {
    public static void main(String[] args) {
        // Creating repository implementations
        AddressRepository addressRepository = new AddressRepositoryImpl();
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        MachineRepository machineRepository = new MachineRepositoryImpl();

        // Creating service implementations
        AddressService addressService = new AddressServiceImpl(addressRepository);
        VehicleService vehicleService = new VehicleServiceImpl(vehicleRepository);
        MachineService machineService = new MachineServiceImpl(machineRepository);

        // Using AddressService
        System.out.println("Address Service Operations:");
        addressService.push();
        addressService.refresh();
        addressService.load();
        addressService.remove();

        // Using VehicleService
        System.out.println("\nVehicle Service Operations:");
        vehicleService.persist();
        vehicleService.merge();
        vehicleService.search();
        vehicleService.clear();

        // Using MachineService
        System.out.println("\nMachine Service Operations:");
        machineService.save();
        machineService.update();
        machineService.read();
        machineService.delete();
    }
}
