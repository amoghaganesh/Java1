package com.xworkz.services.implimentation;

import com.xworkz.services.MachineRepository;
import com.xworkz.services.MachineService;

public class MachineServiceImpl implements MachineService {

    private final MachineRepository machineRepository;

    public MachineServiceImpl(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }
    @Override
    public void save() {
        machineRepository.save();
    }

    @Override
    public void update() {
        machineRepository.update();
    }

    @Override
    public void delete() {
        machineRepository.delete();
    }

    @Override
    public void read() {
        machineRepository.read();
    }
}
