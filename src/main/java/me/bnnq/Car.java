package me.bnnq;

import me.bnnq.enums.VolumeUnit;
import me.bnnq.utilities.ScannerUtilities;

public class Car
{
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car()
    {
        this("Unknown", "Unknown", 0, 0.0);
    }

    public Car(String name, String manufacturer, int year, double engineVolume)
    {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String toString()
    {
        return "Name: " + name + "\nManufacturer: " + manufacturer + "\nYear: " + year + "\nEngine Volume: " + engineVolume;
    }

    public void initialize()
    {
        System.out.print("Enter the name of the car: ");
        name = ScannerUtilities.scanString();
        System.out.print("\nEnter the manufacturer of the car: ");
        manufacturer = ScannerUtilities.scanString();
        System.out.print("\nEnter the year of the car: ");
        year = ScannerUtilities.scanInt();
        System.out.print("\nEnter the engine volume of the car: ");
        engineVolume = ScannerUtilities.scanDouble();
    }

    public String getName()
    {
        return name;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getYear()
    {
        return year;
    }

    public double getEngineVolume(VolumeUnit volumeUnit) {
        return engineVolume * volumeUnit.getValue();
    }

    public double getEngineVolume()
    {
        return getEngineVolume(VolumeUnit.LITER);
    }

}
