package com.xworkz.bookstore.runner;

import com.xworkz.bookstore.constant.BookCategoryConstant;
import com.xworkz.bookstore.constant.PaymentMethodConstant;
import com.xworkz.bookstore.constant.ShippingTypeConstant;
import com.xworkz.bookstore.dto.BookstoreDto;
import com.xworkz.bookstore.service.BookstoreService;
import com.xworkz.bookstore.service.BookstoreServiceImpl;

public class BookstoreRunner {
    public static void main(String[] args) {
        BookstoreDto dto = new BookstoreDto();
        dto.setCustomerName("Amogh");
        dto.setBookCategory(BookCategoryConstant.FICTION);
        dto.setPaymentMethod(PaymentMethodConstant.UPI);
        dto.setShippingType(ShippingTypeConstant.EXPRESS);
        dto.setQuantity(3);
        dto.setPrice(1200.50);

        BookstoreService service = new BookstoreServiceImpl();
        service.validateAndSave(dto);
    }
}
