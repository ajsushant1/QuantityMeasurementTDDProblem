package com.bridgelabz.quantitymeasurement;

public class VolumeEntity implements IConversion {
    //VARIABLES
    private static final double GALLON = 3.78;
    private static final double LITRE = 1;
    private static final double MILLILITRE = 0.001;

    @Override
    public double getConversion(UnitType unitType, double unitValue) {
        switch (unitType) {
            case GALLON:
                return unitValue * GALLON;
            case LITRE:
                return unitValue * LITRE;
            case MILLILITRE:
                return unitValue * MILLILITRE;
        }
        return 0;
    }
}
