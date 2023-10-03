package me.bnnq;

public class Money
{
    private int whole;
    private int penny;


    public Money(int whole, int penny)
    {
        this.whole = whole;
        this.penny = penny;
    }

    public Money()
    {
        this(0, 0);
    }

    public int getWhole()
    {
        return whole;
    }

    public int getPenny()
    {
        return penny;
    }

    public void add(int whole, int penny)
    {
        this.whole += whole;
        this.penny += penny;
        simplify();
    }

    public void subtract(int whole, int penny)
    {
        this.whole -= whole;
        this.penny -= penny;
        simplify();
    }

    private void simplify()
    {
        while (penny < 0)
        {
            whole--;
            penny += 100;
        }
        while (penny >= 100)
        {
            whole++;
            penny -= 100;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%d.%02d", whole, penny);
    }

}
