package me.bnnq.enums;

public enum VolumeUnit
{
    LITER("Liter", 1.0),
    MILLILITER("Milliliter", 0.001),
    CUBIC_METER("Cubic Meter", 1000.0),
    CUBIC_CENTIMETER("Cubic Centimeter", 0.001),
    CUBIC_MILLIMETER("Cubic Millimeter", 0.000001),
    CUBIC_INCH("Cubic Inch", 0.0163871),
    CUBIC_FOOT("Cubic Foot", 28.3168),
    CUBIC_YARD("Cubic Yard", 764.555),
    GALLON("Gallon", 3.78541),
    QUART("Quart", 0.946353),
    PINT("Pint", 0.473176),
    CUP("Cup", 0.236588),
    FLUID_OUNCE("Fluid Ounce", 0.0295735),
    TABLESPOON("Tablespoon", 0.0147868),
    TEASPOON("Teaspoon", 0.00492892);

    private final String name;
    private final double value;

    VolumeUnit(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public double getValue()
    {
        return value;
    }
}
