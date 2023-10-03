package me.bnnq;

import me.bnnq.abstractions.Shape;

public class RightTriangle extends Shape
{
    private double base;
    private double height;

    public RightTriangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return base * height / 2;
    }
}
