package me.bnnq;

import me.bnnq.abstractions.MusicalInstrument;

public class Ukulele extends MusicalInstrument
{
    private String material;
    private String type;
    private String key;

    public Ukulele(String name, String manufacturer, String material, String type, String key)
    {
        super(name, manufacturer);
        this.material = material;
        this.type = type;
        this.key = key;
    }

    public String getMaterial()
    {
        return material;
    }

    public String getType()
    {
        return type;
    }

    public String getKey()
    {
        return key;
    }

    @Override
    public void sound()
    {
        System.out.println("Ukulele sound");
    }

    @Override
    public void desc()
    {
        System.out.println("Ukulele desc");
    }

    @Override
    public void history()
    {
        System.out.println("Ukulele history");
    }

    @Override
    public String toString()
    {
        return String.format("Ukulele: %s, %s, %s, %s", getName(), getMaterial(), getType(), getKey());
    }
}
