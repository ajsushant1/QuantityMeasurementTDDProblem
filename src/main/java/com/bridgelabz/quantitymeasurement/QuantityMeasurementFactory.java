package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurementFactory {

    //METHOD TO GET OBJECT OF UNIT ENTITY
    public static double getConversionUnit(UnitEntity unitEntity, UnitType unitType, double unitValue) {
        if (unitEntity.equals(UnitEntity.LENGTH))
            return new LengthEntity().getConversion(unitType, unitValue);
        if (unitEntity.equals(UnitEntity.VOLUME))
            return new VolumeEntity().getConversion(unitType, unitValue);
        if (unitEntity.equals(UnitEntity.WEIGHT))
            return new WeightEntity().getConversion(unitType, unitValue);
        if (unitEntity.equals(UnitEntity.TEMPERATURE))
            return new TemperatureEntity().getConversion(unitType, unitValue);
        return 0;
    }
}
