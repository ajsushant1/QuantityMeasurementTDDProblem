package com.bridgelabz.quantitymeasurement;

public enum UnitType {
    FEET(12), INCH(1), YARD(36), CENTIMETER(0.4),
    GALLON(3.78), LITRE(1), MILLILITRE(0.001),
    KILOGRAM(1), GRAMS(0.001), TONNE(1000);

    public double conversionUnitValue;

    UnitType(double conversionUnitValue) {
        this.conversionUnitValue = conversionUnitValue;
    }

}
