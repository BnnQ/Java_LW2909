package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Country
{
    private String name;
    private String continent;
    private int population;
    private String capital;
    private String[] citiesNames;
    private String phoneCode;

    public Country()
    {
        this("N/A", "N/A", 0, "N/A", new String[0], "N/A");
    }

    public Country(String name, String continent, int population, String capital, String[] citiesNames, String phoneCode)
    {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.capital = capital;
        this.citiesNames = citiesNames;
        this.phoneCode = phoneCode;
    }

public void initialize()
    {
        System.out.print("Enter a country name: ");
        name = ScannerUtilities.scanString();

        System.out.print("\nEnter a continent name: ");
        continent = ScannerUtilities.scanString();

        System.out.print("\nEnter a population: ");
        population = ScannerUtilities.scanInt();

        System.out.print("\nEnter a capital name: ");
        capital = ScannerUtilities.scanString();

        System.out.print("\nEnter a phone code: ");
        phoneCode = ScannerUtilities.scanString();

        System.out.print("\nEnter the number of cities: ");
        int numberOfCities = ScannerUtilities.scanInt();
        citiesNames = new String[numberOfCities];
        for (int i = 0; i < numberOfCities; i++)
        {
            System.out.printf("\nEnter a #%d city name: ", i + 1);
            citiesNames[i] = ScannerUtilities.scanString();
        }
    }

    @Override
    public String toString()
    {
        StringBuilder cityListStringBuilder = new StringBuilder();
        for (String city : citiesNames)
        {
            cityListStringBuilder.append(city).append(", ");
        }
        cityListStringBuilder.delete(cityListStringBuilder.length() - 2, cityListStringBuilder.length());

        return "Country " + name + ":\nContinent: " + continent + "\nPopulation: " + population + "\nCapital: " + capital + "\nCities: " + cityListStringBuilder + "\nPhone Code: " + phoneCode + "\n";
    }

}
