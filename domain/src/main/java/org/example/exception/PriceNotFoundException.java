package org.example.exception;

public class PriceNotFoundException extends RuntimeException {

    public PriceNotFoundException(String message) {
        super(message);
    }    
}
