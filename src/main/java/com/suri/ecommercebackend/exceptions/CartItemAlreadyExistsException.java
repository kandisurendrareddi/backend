package com.suri.ecommercebackend.exceptions;

public class CartItemAlreadyExistsException extends RuntimeException {
    public CartItemAlreadyExistsException(String message) {
        super(message);
    }
}
