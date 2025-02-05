package com.xworkz.bookstore.service;

import com.xworkz.bookstore.dto.BookstoreDto;

public class BookstoreServiceImpl extends BookstoreService {

    @Override
    public boolean validateAndSave(BookstoreDto dto) {
        if (dto != null) {
            System.out.println("Validating and saving order: " + dto.getCustomerName());
            return true;
        }
        return false;
    }
}
