package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Fraction
{
private int numerator;
    private int denominator;

    public Fraction()
    {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void initialize()
    {
        System.out.print("Enter a numerator: ");
        numerator = ScannerUtilities.scanInt();

        System.out.print("\nEnter a denominator: ");
        denominator = ScannerUtilities.scanInt();
    }

    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Fraction add(Fraction fraction)
    {
        int newNumerator = numerator * fraction.getDenominator() + fraction.getNumerator() * denominator;
        int newDenominator = denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction fraction)
    {
        int newNumerator = numerator * fraction.getDenominator() - fraction.getNumerator() * denominator;
        int newDenominator = denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction fraction)
    {
        int newNumerator = numerator * fraction.getNumerator();
        int newDenominator = denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction fraction)
    {
        int newNumerator = numerator * fraction.getDenominator();
        int newDenominator = denominator * fraction.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction simplify()
    {
        int gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    private int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}