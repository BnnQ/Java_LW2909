package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Human
{
    private String name;
    private int age;

    public Human()
    {
        this("N/A", 0);
    }
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize()
    {
        System.out.print("\nEnter name: ");
        name = ScannerUtilities.scanString();

        System.out.print("\nEnter age: ");
        age = ScannerUtilities.scanInt();
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s\nAge: %d", name, age);
    }

}
