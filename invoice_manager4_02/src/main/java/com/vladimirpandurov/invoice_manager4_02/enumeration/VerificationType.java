package com.vladimirpandurov.invoice_manager4_02.enumeration;

public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");

    private final String type;

    VerificationType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type.toLowerCase();
    }
}
