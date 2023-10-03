package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class ForeignPassport extends Passport
{
    private String country;
    private String vises;
    private String foreignSerialNumber;

    public ForeignPassport()
    {
        this("0000", "000000", "Ukraine", "No", "000000");
    }

    public ForeignPassport(String series, String number, String country, String vises, String foreignSerialNumber)
    {
        super(series, number);
        this.country = country;
        this.vises = vises;
        this.foreignSerialNumber = foreignSerialNumber;
    }

    public void initialize()
    {
        super.initialize();
        System.out.print("Enter country: ");
        country = ScannerUtilities.scanString();
        System.out.print("Enter vises: ");
        vises = ScannerUtilities.scanString();
        System.out.print("Enter foreign serial number: ");
        foreignSerialNumber = ScannerUtilities.scanString();
    }

    public String getCountry()
    {
        return country;
    }

    public String getVises()
    {
        return vises;
    }

    public String getForeignSerialNumber()
    {
        return foreignSerialNumber;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setVises(String vises)
    {
        this.vises = vises;
    }

    public void setForeignSerialNumber(String foreignSerialNumber)
    {
        this.foreignSerialNumber = foreignSerialNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s\nCountry: %s\nVises: %s\nForeign serial number: %s", super.toString(), country, vises, foreignSerialNumber);
    }

}
