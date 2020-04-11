package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    private double conversionValue;

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO QUANTITY MEASUREMENT /**************************/");
    }

    //METHOD TO GET CONVERSION
    public double getConversionValue(UnitType unitType, double unitValue) {
        if (unitType.equals(UnitType.CELSIUS)) {
            this.conversionValue = (unitType.conversionUnitValue * unitValue) + 32;
            return conversionValue;
        }
        this.conversionValue = unitType.conversionUnitValue * unitValue;
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

    //METHOD TO GET ADDITION
    public double addQuantity(double quantity1, double quantity2) {
        return quantity1 + quantity2;
    }
}

