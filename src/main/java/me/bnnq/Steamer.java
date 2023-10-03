package me.bnnq;

import me.bnnq.abstractions.Device;

public class Steamer extends Device
{
    private int volume;
    private int temperature;

    public Steamer(String name, int volume, int temperature)
    {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Steamer()
    {
        this("", 0, 0);
    }

    public int getVolume()
    {
        return volume;
    }

    public int getTemperature()
    {
        return temperature;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void desc() {
        System.out.println("This is a steamer");
    }

    @Override
    public void sound()
    {
        System.out.println("Steamer sound");
    }

    @Override
    public String toString()
    {
        return String.format("Steamer: %s, volume: %d, temperature: %d", getName(), volume, temperature);
    }
}
