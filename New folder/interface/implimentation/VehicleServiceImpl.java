package com.xworkz.services.implimentation;

import com.xworkz.services.VehicleRepository;
import com.xworkz.services.VehicleService;

public class VehicleServiceImpl implements VehicleService {
    private final  VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void persist() {
        vehicleRepository.save();
    }

    @Override
    public void merge() {
        vehicleRepository.update();
    }

    @Override
    public void clear() {
        vehicleRepository.delete();
    }

    @Override
    public void search() {
        System.out.println(vehicleRepository.read());
    }
}
