package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurementException extends Exception {
    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    //ENUM FOR EXCEPTION TYPE
    public enum ExceptionType {
        UNIT_ENTITY_MISMATCH, NOT_POSSIBLE, NULL_VALUE
    }

}
