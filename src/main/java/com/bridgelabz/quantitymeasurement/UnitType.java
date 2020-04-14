package com.bridgelabz.quantitymeasurement;

public enum UnitType {
    FEET(UnitEntity.LENGTH), INCH(UnitEntity.LENGTH), YARD(UnitEntity.LENGTH), CENTIMETER(UnitEntity.LENGTH),
    GALLON(UnitEntity.VOLUME), LITRE(UnitEntity.VOLUME), MILLILITRE(UnitEntity.VOLUME),
    KILOGRAM(UnitEntity.WEIGHT), GRAMS(UnitEntity.WEIGHT), TONNE(UnitEntity.WEIGHT),
    FAHRENHEIT(UnitEntity.TEMPERATURE), CELSIUS(UnitEntity.TEMPERATURE);

    UnitEntity unitEntity;

    UnitType(UnitEntity unitEntity) {
        this.unitEntity = unitEntity;
    }

}
