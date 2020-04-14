package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenZeroFeet_ShouldReturnEqual() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenDifferentFeetValue_ShouldReturnNotEqual() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        Assert.assertNotEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenNullValueToFeet_ShouldReturnFalse() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertFalse(firstFeetQuantity.equals(null));
    }

    @Test
    public void givenSameReferenceToFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        boolean equals = firstFeetQuantity.equals(firstFeetQuantity);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeetObjectType_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenSameValueToFeet_WhenEqual_ShouldReturnEqual() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void givenZeroInch_ShouldReturnEqual() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertEquals(firstInchQuantity, secondInchQuantity);
    }

    @Test
    public void givenDifferentInchValue_ShouldReturnNotEqual() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 5);
        Assert.assertNotEquals(firstInchQuantity, secondInchQuantity);
    }

    @Test
    public void givenNullValueToInch_ShouldReturnFalse() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertFalse(firstInchQuantity.equals(null));
    }

    @Test
    public void givenSameReferenceToInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        boolean equals = firstInchQuantity.equals(firstInchQuantity);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInchObjectType_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertEquals(firstInchQuantity, secondInchQuantity);
    }

    @Test
    public void givenSameValueToInch_WhenEqual_ShouldReturnEqual() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        Assert.assertEquals(firstInchQuantity, secondInchQuantity);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 12);
        Assert.assertEquals(feetQuantity, inchQuantity);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        Assert.assertNotEquals(feetQuantity, inchQuantity);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 0);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertEquals(feetQuantity, inchQuantity);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        Assert.assertNotEquals(feetQuantity, inchQuantity);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqual() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        Assert.assertEquals(firstFeetQuantity, secondFeetQuantity);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertEquals(firstInchQuantity, secondInchQuantity);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 3);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        Assert.assertEquals(feetQuantity, yardQuantity);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        Assert.assertNotEquals(feetQuantity, yardQuantity);
    }

    @Test
    public void given1inchAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        Assert.assertNotEquals(inchQuantity, yardQuantity);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 36);
        Assert.assertEquals(yardQuantity, inchQuantity);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 36);
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        Assert.assertEquals(inchQuantity, yardQuantity);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        QuantityMeasurement yardQuantity = new QuantityMeasurement(UnitType.YARD, 1);
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 3);
        Assert.assertEquals(yardQuantity, feetQuantity);
    }

    @Test
    public void givenInchAndCentimeterLength_ShouldReturnEqual() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 1);
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(UnitType.CENTIMETER, 2.5);
        Assert.assertEquals(inchQuantity, centimeterQuantity);
    }

    @Test
    public void given2InchAnd5CentimeterLength_ShouldReturnEqual() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 2);
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(UnitType.CENTIMETER, 5);
        Assert.assertEquals(inchQuantity, centimeterQuantity);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdd_ShouldReturn4Inch() {
        QuantityMeasurement firstInchQuantity = new QuantityMeasurement(UnitType.INCH, 2);
        QuantityMeasurement secondInchQuantity = new QuantityMeasurement(UnitType.INCH, 2);
        try {
            double quantity = firstInchQuantity.addQuantity(firstInchQuantity, secondInchQuantity);
            Assert.assertEquals(4, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturn14Inch() {
        QuantityMeasurement feetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 2);
        try {
            double quantity = feetQuantity.addQuantity(feetQuantity, inchQuantity);
            Assert.assertEquals(14, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturn24Inch() {
        QuantityMeasurement firstFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        QuantityMeasurement secondFeetQuantity = new QuantityMeasurement(UnitType.FEET, 1);
        try {
            double quantity = firstFeetQuantity.addQuantity(firstFeetQuantity, secondFeetQuantity);
            Assert.assertEquals(24, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenInchAndCentimeter_WhenAdd_ShouldReturn3Inch() {
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 2);
        QuantityMeasurement centimeterQuantity = new QuantityMeasurement(UnitType.CENTIMETER, 2.5);
        try {
            double quantity = inchQuantity.addQuantity(inchQuantity, centimeterQuantity);
            Assert.assertEquals(3, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenVolumesGallonAndLitre_ShouldReturnEqual() {
        QuantityMeasurement gallonQuantity = new QuantityMeasurement(UnitType.GALLON, 1);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(UnitType.LITRE, 3.78);
        Assert.assertEquals(gallonQuantity, litreQuantity);
    }

    @Test
    public void givenVolumesLitreAndMillilitre_ShouldReturnEqual() {
        QuantityMeasurement litreQuantity = new QuantityMeasurement(UnitType.LITRE, 1);
        QuantityMeasurement millilitreQuantity = new QuantityMeasurement(UnitType.MILLILITRE, 1000);
        Assert.assertEquals(litreQuantity, millilitreQuantity);
    }

    @Test
    public void givenVolumesGallonAndLitre_WhenAdd_ShouldReturnAddition() {
        QuantityMeasurement gallonQuantity = new QuantityMeasurement(UnitType.GALLON, 1);
        QuantityMeasurement litreQuantity = new QuantityMeasurement(UnitType.LITRE, 3.78);
        try {
            double quantity = gallonQuantity.addQuantity(gallonQuantity, litreQuantity);
            Assert.assertEquals(7.56, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenVolumesLitreAndMillilitre_WhenAdd_ShouldReturnAddition() {
        QuantityMeasurement litreQuantity = new QuantityMeasurement(UnitType.LITRE, 1);
        QuantityMeasurement millilitreQuantity = new QuantityMeasurement(UnitType.MILLILITRE, 1000);
        try {
            double quantity = litreQuantity.addQuantity(litreQuantity, millilitreQuantity);
            Assert.assertEquals(2, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenWeightsKgAndGrams_ShouldReturnEqual() {
        QuantityMeasurement kilogramQuantity = new QuantityMeasurement(UnitType.KILOGRAM, 1);
        QuantityMeasurement gramQuantity = new QuantityMeasurement(UnitType.GRAMS, 1000);
        Assert.assertEquals(kilogramQuantity, gramQuantity);
    }

    @Test
    public void givenWeightsTonneAndKgs_ShouldReturnEqual() {
        QuantityMeasurement tonneQuantity = new QuantityMeasurement(UnitType.TONNE, 1);
        QuantityMeasurement kilogramQuantity = new QuantityMeasurement(UnitType.KILOGRAM, 1000);
        Assert.assertEquals(tonneQuantity, kilogramQuantity);
    }

    @Test
    public void givenWeightsTonneAndGrams_WhenAdd_ShouldReturnAddition() {
        QuantityMeasurement tonneQuantity = new QuantityMeasurement(UnitType.TONNE, 1);
        QuantityMeasurement gramQuantity = new QuantityMeasurement(UnitType.GRAMS, 1000);
        try {
            double quantity = tonneQuantity.addQuantity(tonneQuantity, gramQuantity);
            Assert.assertEquals(1001, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenWeightsKgAndGrams_WhenAdd_ShouldReturnAddition() {
        QuantityMeasurement kilogramQuantity = new QuantityMeasurement(UnitType.KILOGRAM, 1);
        QuantityMeasurement gramQuantity = new QuantityMeasurement(UnitType.GRAMS, 1000);
        try {
            double quantity = kilogramQuantity.addQuantity(kilogramQuantity, gramQuantity);
            Assert.assertEquals(2, quantity, 0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTemperature0_WhenCompare_ShouldReturnEqual() {
        QuantityMeasurement celsiusQuantity = new QuantityMeasurement(UnitType.CELSIUS, 0);
        QuantityMeasurement fahrenheitQuantity = new QuantityMeasurement(UnitType.FAHRENHEIT, 32);
        Assert.assertEquals(celsiusQuantity, fahrenheitQuantity);
    }

    @Test
    public void givenTemperature_WhenCompare_ShouldReturnEqual() {
        QuantityMeasurement fahrenheitQuantity = new QuantityMeasurement(UnitType.FAHRENHEIT, 212);
        QuantityMeasurement celsiusQuantity = new QuantityMeasurement(UnitType.CELSIUS, 100);
        Assert.assertEquals(fahrenheitQuantity, celsiusQuantity);
    }

    @Test
    public void givenDifferentUniEntityValueToAdd_WhenUnitEntityMisMatch_ShouldThrowException() {
        QuantityMeasurement gramQuantity = new QuantityMeasurement(UnitType.GRAMS, 0);
        QuantityMeasurement inchQuantity = new QuantityMeasurement(UnitType.INCH, 0);
        try {
            gramQuantity.addQuantity(gramQuantity, inchQuantity);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_ENTITY_MISMATCH, e.type);
        }
    }

    @Test
    public void givenTemperatureValueToAdd_ShouldThrowException() {
        QuantityMeasurement fahrenheitQuantity = new QuantityMeasurement(UnitType.FAHRENHEIT, 212);
        QuantityMeasurement celsiusQuantity = new QuantityMeasurement(UnitType.CELSIUS, 100);
        try {
            fahrenheitQuantity.addQuantity(fahrenheitQuantity, celsiusQuantity);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NOT_POSSIBLE, e.type);
        }
    }

    @Test
    public void givenNullValueToAdd_WhenNull_ShouldThrowException() {
        QuantityMeasurement gramQuantity = new QuantityMeasurement(UnitType.GRAMS, 0);
        try {
            gramQuantity.addQuantity(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }
}
