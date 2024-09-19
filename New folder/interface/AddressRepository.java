package com.xworkz.services;

public interface AddressRepository {

    boolean save();
    int update();
    void delete();
    String read();
}
