package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    //INSTANCE VARIABLES
    UnitType unitType;
    UnitEntity unitEntity;
    double conversionUnitValue;

    //CONSTRUCTOR
    public QuantityMeasurement(UnitType unitType,double unitValue) {
        this.unitType=unitType;
        this.unitEntity=unitType.unitEntity;
        this.conversionUnitValue=getConversionValue(unitValue);
    }

    //METHOD TO GET CONVERSION
    private double getConversionValue(double unitValue) {
         return QuantityMeasurementFactory.getConversionUnit(unitEntity, unitType, unitValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.conversionUnitValue, conversionUnitValue) == 0 &&
                unitEntity == that.unitEntity;
    }

    //METHOD TO GET ADDITION
    public double addQuantity(QuantityMeasurement firstQuantity,QuantityMeasurement secondQuantity) throws QuantityMeasurementException {
       return MeasurementUtils.addQuantity(firstQuantity,secondQuantity);
    }
}

