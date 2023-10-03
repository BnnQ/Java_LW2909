package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Passport
{
    private String series;
    private String number;

    public Passport()
    {
        this("0000", "000000");
    }
    public Passport(String series, String number)
    {
        this.series = series;
        this.number = number;
    }

    public void initialize() {
        System.out.print("Enter passport series: ");
        series = ScannerUtilities.scanString();
        System.out.print("Enter passport number: ");
        number = ScannerUtilities.scanString();
    }

    public String getSeries()
    {
        return series;
    }

    public String getNumber()
    {
        return number;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return String.format("Passport: %s %s", series, number);
    }
}
