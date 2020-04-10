package com.bridgelabz.quantitymeasurement;

public enum UnitType {
    FEET(12), INCH(1);

    public double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
