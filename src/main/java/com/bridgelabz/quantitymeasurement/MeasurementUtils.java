package com.bridgelabz.quantitymeasurement;

public class MeasurementUtils {
    //METHOD TO GET ADDITION OF TWO QUANTITY
    public static double addQuantity(QuantityMeasurement firstQuantity, QuantityMeasurement secondQuantity) throws QuantityMeasurementException {
        if (firstQuantity == null || secondQuantity == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null Value");
        if (firstQuantity.unitEntity != secondQuantity.unitEntity)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_ENTITY_MISMATCH, "UnitEntity Mismatch");
        if (firstQuantity.unitEntity == UnitEntity.TEMPERATURE)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NOT_POSSIBLE, "Addition Not Possible");
        return firstQuantity.conversionUnitValue + secondQuantity.conversionUnitValue;
    }
}
