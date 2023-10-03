package me.bnnq;

import me.bnnq.abstractions.Shape;

public class Trapezoid extends Shape
{
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height)
    {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return (base1 + base2) * height / 2;
    }
}
