package com.vicksanchez.currencyconverter.exceptions;

public class InvalidOptionException extends RuntimeException{

    private String message;

    public InvalidOptionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
