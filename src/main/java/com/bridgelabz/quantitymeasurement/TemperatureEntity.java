package com.bridgelabz.quantitymeasurement;

public class TemperatureEntity implements IConversion {
    //VARIABLES
    private static final double FAHRENHEIT = 1;
    private static final double CELSIUS = 1.8;

    @Override
    public double getConversion(UnitType unitType, double unitValue) {
        switch (unitType) {
            case FAHRENHEIT:
                return unitValue * FAHRENHEIT;
            case CELSIUS:
                return unitValue * CELSIUS + 32;
        }
        return 0;
    }
}
