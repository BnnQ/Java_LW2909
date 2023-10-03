package me.bnnq;

public class Kangaroo extends Animal
{
    public Kangaroo(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("Kangaroo is eating...");
    }

    @Override
    public void sleep()
    {
        System.out.println("Kangaroo is sleeping...");
    }

    public void jump()
    {
        System.out.println("Kangaroo is jumping...");
    }
}