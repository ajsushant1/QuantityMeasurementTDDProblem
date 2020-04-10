package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    private double conversionValue;

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO QUANTITY MEASUREMENT /**************************/");
    }

    //METHOD TO GET FEET LENGTH
    public double getConversionValue(UnitType unitType, double unitValue) {
        this.conversionValue = unitType.conversionUnit * unitValue;
        return conversionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() == o.getClass())
            return true;
        if (o.equals(o))
            return true;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.conversionValue, conversionValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversionValue);
    }
}

