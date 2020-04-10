package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeet_ShouldReturnEqual() {
        double value1 = quantityMeasurement.getFeetValue(0.0);
        double value2 = quantityMeasurement.getFeetValue(0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    @Test
    public void givenDifferentFeetValue_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.getFeetValue(0.0);
        double value2 = quantityMeasurement.getFeetValue(5.0);
        Assert.assertNotEquals(value1, value2, 0);
    }

    @Test
    public void givenNullValueToFeet_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenSameReferenceToFeet_WhenEqual_ShouldReturnTrue() {
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeetObjectType_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement measurement1 = new QuantityMeasurement();
        QuantityMeasurement measurement2 = new QuantityMeasurement();
        Assert.assertEquals(measurement1, measurement2);
    }

    @Test
    public void givenSameValueToFeet_WhenEqual_ShouldReturnEqual() {
        int value = 12;
        boolean equals = quantityMeasurement.equals(value);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenZeroInch_ShouldReturnEqual() {
        double inchValue1 = quantityMeasurement.getInchValue(0.0);
        double inchValue2 = quantityMeasurement.getInchValue(0.0);
        Assert.assertEquals(inchValue1, inchValue2, 0);
    }

    @Test
    public void givenDifferentInchValue_ShouldReturnNotEqual() {
        double inchValue1 = quantityMeasurement.getInchValue(1.0);
        double inchValue2 = quantityMeasurement.getInchValue(5.0);
        Assert.assertNotEquals(inchValue1, inchValue2, 0);
    }

    @Test
    public void givenNullValueToInch_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenSameReferenceToInch_WhenEqual_ShouldReturnTrue() {
        boolean equals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInchObjectType_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement measurement1 = new QuantityMeasurement();
        QuantityMeasurement measurement2 = new QuantityMeasurement();
        Assert.assertEquals(measurement1, measurement2);
    }

    @Test
    public void givenSameValueToInch_WhenEqual_ShouldReturnEqual() {
        int value = 10;
        boolean equals = quantityMeasurement.equals(value);
        Assert.assertTrue(equals);
    }
}
