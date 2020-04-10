package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeet_ShouldReturnEqual() {
        double value1 = quantityMeasurement.getConversionValue(UnitType.FEET, 0.0);
        double value2 = quantityMeasurement.getConversionValue(UnitType.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    @Test
    public void givenDifferentFeetValue_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.getConversionValue(UnitType.FEET, 0.0);
        double value2 = quantityMeasurement.getConversionValue(UnitType.FEET, 5.0);
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

    //FOR INCH
    @Test
    public void givenZeroInch_ShouldReturnEqual() {
        double inchValue1 = quantityMeasurement.getConversionValue(UnitType.INCH, 0.0);
        double inchValue2 = quantityMeasurement.getConversionValue(UnitType.INCH, 0.0);
        Assert.assertEquals(inchValue1, inchValue2, 0);
    }

    @Test
    public void givenDifferentInchValue_ShouldReturnNotEqual() {
        double inchValue1 = quantityMeasurement.getConversionValue(UnitType.INCH, 1.0);
        double inchValue2 = quantityMeasurement.getConversionValue(UnitType.INCH, 5.0);
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

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 12);
        Assert.assertEquals(feetValue, inchValue, 0);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        Assert.assertNotEquals(feetValue, inchValue, 0);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqual() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 0);
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 0);
        Assert.assertEquals(feetValue, inchValue, 0);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        Assert.assertNotEquals(inchValue, feetValue, 0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqual() {
        double feetValue1 = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double feetValue2 = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        Assert.assertEquals(feetValue1, feetValue2, 0);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        double inchValue1 = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        double inchValue2 = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        Assert.assertEquals(inchValue1, inchValue2, 0);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 3);
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        Assert.assertEquals(feetValue, yardValue, 0);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        Assert.assertNotEquals(feetValue, yardValue, 0);
    }

    @Test
    public void given1inchAnd1Yard_ShouldReturnNotEqual() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        Assert.assertNotEquals(inchValue, yardValue, 0);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 36);
        Assert.assertEquals(yardValue, inchValue, 0);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 36);
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        Assert.assertEquals(inchValue, yardValue, 0);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        double yardValue = quantityMeasurement.getConversionValue(UnitType.YARD, 1);
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 3);
        Assert.assertEquals(yardValue, feetValue, 0);
    }

    @Test
    public void givenInchAndCentimeterLength_ShouldReturnEqual() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 1);
        double centimeterValue = quantityMeasurement.getConversionValue(UnitType.CENTIMETER, 2.5);
        Assert.assertEquals(inchValue, centimeterValue, 0);
    }

    @Test
    public void given2InchAnd5CentimeterLength_ShouldReturnEqual() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 2);
        double centimeterValue = quantityMeasurement.getConversionValue(UnitType.CENTIMETER, 5);
        Assert.assertEquals(inchValue, centimeterValue, 0);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        double inchValue1 = quantityMeasurement.getConversionValue(UnitType.INCH, 2);
        double inchValue2 = quantityMeasurement.getConversionValue(UnitType.INCH, 2);
        double quantity = quantityMeasurement.addQuantity(inchValue1, inchValue2);
        Assert.assertEquals(4, quantity, 0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inch() {
        double feetValue = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 2);
        double quantity = quantityMeasurement.addQuantity(feetValue, inchValue);
        Assert.assertEquals(14, quantity, 0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inch() {
        double feetValue1 = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double feetValue2 = quantityMeasurement.getConversionValue(UnitType.FEET, 1);
        double quantity = quantityMeasurement.addQuantity(feetValue1, feetValue2);
    }

    @Test
    public void givenInchAndCentimeter_ShouldReturn3Inch() {
        double inchValue = quantityMeasurement.getConversionValue(UnitType.INCH, 2);
        double centimeterValue = quantityMeasurement.getConversionValue(UnitType.CENTIMETER, 2.5);
        double quantity = quantityMeasurement.addQuantity(inchValue, centimeterValue);
        Assert.assertEquals(3, quantity, 0);
    }

    @Test
    public void givenVolumesGallonAndLitre_ShouldReturnEqual() {
        double gallonValue = quantityMeasurement.getConversionValue(UnitType.GALLON, 1);
        double litreValue = quantityMeasurement.getConversionValue(UnitType.LITRE, 3.78);
        Assert.assertEquals(gallonValue, litreValue, 0);
    }

    @Test
    public void givenVolumesLitreAndMillilitre_ShouldReturnEqual() {
        double litreValue = quantityMeasurement.getConversionValue(UnitType.LITRE, 1);
        double millilitreValue = quantityMeasurement.getConversionValue(UnitType.MILLILITRE, 1000);
        Assert.assertEquals(litreValue,millilitreValue,0);
    }
}
