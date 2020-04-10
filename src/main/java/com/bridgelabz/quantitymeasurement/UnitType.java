package com.bridgelabz.quantitymeasurement;

public enum UnitType {
    FEET(12), INCH(1), YARD(36), CENTIMETER(0.4);

    public double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
