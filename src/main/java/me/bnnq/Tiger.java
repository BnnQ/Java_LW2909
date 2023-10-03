package me.bnnq;

public class Tiger extends Animal
{
    public Tiger(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("Tiger is eating...");
    }

    @Override
    public void sleep()
    {
        System.out.println("Tiger is sleeping...");
    }

    public void run()
    {
        System.out.println("Tiger is running...");
    }
}
