package me.bnnq.utilities;

public class AreaMath
{
    private static int numberOfCalculations = 0;

    public static double getTriangleArea(double base, double height)
    {
        numberOfCalculations++;

        return base * height / 2;
    }

    public static double getTriangleArea(double a, double b, double c)
    {
        numberOfCalculations++;

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double getSquareArea(double side)
    {
        numberOfCalculations++;

        return side * side;
    }

    public static double getRectangleArea(double width, double height)
    {
        numberOfCalculations++;

        return width * height;
    }

    public static double getRhombusArea(double firstDiagonal, double secondDiagonal)
    {
        numberOfCalculations++;

        return firstDiagonal * secondDiagonal / 2;
    }

    public static int getNumberOfCalculations()
    {
        return numberOfCalculations;
    }

}
