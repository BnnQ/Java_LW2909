package me.bnnq.abstractions;

public abstract class Device
{
    private String name;

    public Device(String name)
    {
        this.name = name;
    }

    public Device()
    {
        this("");
    }

    public String getName()
    {
        return name;
    }

    public abstract void sound();

    public void show()
    {
        System.out.println(name);
    }

    public abstract void desc();
}
