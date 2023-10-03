package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Sailor extends Human
{
    private String rank;
    private String shipName;

    public Sailor()
    {
        this("N/A", 0, "N/A", "N/A");
    }

    public Sailor(String name, int age, String rank, String shipName)
    {
        super(name, age);
        this.rank = rank;
        this.shipName = shipName;
    }

    public void initialize()
    {
        super.initialize();

        System.out.print("\nEnter rank: ");
        rank = ScannerUtilities.scanString();

        System.out.print("\nEnter ship name: ");
        shipName = ScannerUtilities.scanString();
    }

    public String getRank()
    {
        return rank;
    }

    public String getShipName()
    {
        return shipName;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }

    @Override
    public String toString()
    {
        return String.format("%s\nRank: %s\nShip name: %s", super.toString(), rank, shipName);
    }
}
