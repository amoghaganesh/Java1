package com.xworkz.services.implimentation;

import com.xworkz.services.AddressRepository;
import com.xworkz.services.AddressService;

public class AddressServiceImpl implements AddressService {


    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void push() {
        addressRepository.save();
    }

    @Override
    public void refresh() {
        addressRepository.update();
    }

    @Override
    public void remove() {
        addressRepository.delete();
    }

    @Override
    public void load() {
        System.out.println(addressRepository.read());
    }
}
