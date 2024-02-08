package com.vladimirpandurov.invoice_manager4_02.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
