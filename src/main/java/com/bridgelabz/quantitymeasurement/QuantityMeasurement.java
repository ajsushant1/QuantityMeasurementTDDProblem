package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    private double feetUnitValue;
    private double inchUnitValue;


    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO QUANTITY MEASUREMENT /**************************/");
    }

    //METHOD TO GET FEET LENGTH
    public double getFeetValue(double feetLength) {
        this.feetUnitValue = feetLength * 12;
        return feetUnitValue;
    }

    //METHOD TO GET INCH LENGTH
    public double getInchValue(double inchLength) {
        this.inchUnitValue = inchLength * 1;
        return inchUnitValue;
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
        return Double.compare(that.feetUnitValue, feetUnitValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feetUnitValue);
    }
}

