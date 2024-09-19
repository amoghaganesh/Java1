package com.xworkz.services.implimentation;

import com.xworkz.services.AddressRepository;

public class AddressRepositoryImpl implements AddressRepository {


    @Override
    public boolean save() {
        System.out.println("Address saved.");
        return true;
    }

    @Override
    public int update() {
        System.out.println("Address updated.");
        return 1;
    }

    @Override
    public void delete() {
        System.out.println("Address deleted.");
    }

    @Override
    public String read() {
        System.out.println("address read");
        return "Reading Address Data";
    }
}
