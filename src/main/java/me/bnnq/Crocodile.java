package me.bnnq;

public class Crocodile extends Animal
{
    public Crocodile(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("Crocodile is eating...");
    }

    @Override
    public void sleep()
    {
        System.out.println("Crocodile is sleeping...");
    }

    public void swim()
    {
        System.out.println("Crocodile is swimming...");
    }
}
