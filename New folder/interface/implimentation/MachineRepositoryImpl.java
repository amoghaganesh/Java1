package com.xworkz.services.implimentation;

import com.xworkz.services.MachineRepository;

public class MachineRepositoryImpl implements MachineRepository {
    @Override
    public void save() {
        System.out.println("Machine saved.");
    }

    @Override
    public int update() {
        System.out.println("Machine updated.");
        return 1;
    }

    @Override
    public int delete() {
        System.out.println("Machine deleted.");
        return 1;
    }

    @Override
    public int read() {
        System.out.println("Reading Machine Data");
        return 1;
    }
}
