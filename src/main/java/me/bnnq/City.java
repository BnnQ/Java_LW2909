package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class City
{
    private String name;
    private String country;
    private String region;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City()
    {
        this("N/A", "N/A", "N/A", 0, "N/A", "N/A");
    }
    public City(String name, String country, String region, int population, String postalCode, String phoneCode)
    {
        this.name = name;
        this.country = country;
        this.region = region;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public void initialize()
    {
        System.out.print("Enter a city name: ");
        name = ScannerUtilities.scanString();

        System.out.print("\nEnter a country name: ");
        country = ScannerUtilities.scanString();

        System.out.print("\nEnter a region name: ");
        region = ScannerUtilities.scanString();

        System.out.print("\nEnter a population: ");
        population = ScannerUtilities.scanInt();

        System.out.print("\nEnter a postal code: ");
        postalCode = ScannerUtilities.scanString();

        System.out.print("\nEnter a phone code: ");
        phoneCode = ScannerUtilities.scanString();
    }

    @Override
    public String toString()
    {
        return "City " + name + ":\nCountry: " + country + "\nRegion: " + region + "\nPopulation: " + population + "\nPostal Code: " + postalCode + "\nPhone Code: " + phoneCode + "\n";
    }

    public String getName()
    {
        return name;
    }

    public String getCountry()
    {
        return country;
    }

    public String getRegion()
    {
        return region;
    }

    public int getPopulation()
    {
        return population;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getPhoneCode()
    {
        return phoneCode;
    }

}
