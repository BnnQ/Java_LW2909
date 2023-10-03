package me.bnnq;

import me.bnnq.abstractions.Device;

public class Microwave extends Device
{
    private int power;
    private int volume;

    public Microwave(String name, int power, int volume)
    {
        super(name);
        this.power = power;
        this.volume = volume;
    }

    public Microwave()
    {
        this("", 0, 0);
    }

    public int getPower()
    {
        return power;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public void desc() {
        System.out.println("This is a microwave");
    }

    @Override
    public void sound()
    {
        System.out.println("Microwave sound");
    }

    @Override
    public String toString()
    {
        return String.format("Microwave: %s, power: %d, volume: %d", getName(), power, volume);
    }
}
