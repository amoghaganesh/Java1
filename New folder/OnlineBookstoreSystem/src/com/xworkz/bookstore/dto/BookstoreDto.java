package com.xworkz.bookstore.dto;

import com.xworkz.bookstore.constant.BookCategoryConstant;
import com.xworkz.bookstore.constant.PaymentMethodConstant;
import com.xworkz.bookstore.constant.ShippingTypeConstant;

public class BookstoreDto {
    private String customerName;
    private BookCategoryConstant bookCategory;
    private PaymentMethodConstant paymentMethod;
    private ShippingTypeConstant shippingType;
    private int quantity;
    private double price;

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BookCategoryConstant getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategoryConstant bookCategory) {
        this.bookCategory = bookCategory;
    }

    public PaymentMethodConstant getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodConstant paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ShippingTypeConstant getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingTypeConstant shippingType) {
        this.shippingType = shippingType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
