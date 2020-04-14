package com.bridgelabz.quantitymeasurement;

public class WeightEntity implements IConversion {
    //VARIABLES
    private static final double KILOGRAM = 1;
    private static final double GRAMS = 0.001;
    private static final double TONNE = 1000;

    @Override
    public double getConversion(UnitType unitType, double unitValue) {
        switch (unitType) {
            case KILOGRAM:
                return unitValue * KILOGRAM;
            case GRAMS:
                return unitValue * GRAMS;
            case TONNE:
                return unitValue * TONNE;
        }
        return 0;
    }
}
