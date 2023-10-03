package me.bnnq;

import me.bnnq.abstractions.MusicalInstrument;

public class Trombone extends MusicalInstrument
{
private String material;
    private String type;
    private String key;

    public Trombone(String name, String manufacturer, String material, String type, String key)
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
        System.out.println("Trombone sound");
    }

    @Override
    public void desc()
    {
        System.out.println("Trombone desc");
    }

    @Override
    public void history()
    {
        System.out.println("Trombone history");
    }

    @Override
    public String toString()
    {
        return String.format("Trombone: %s, %s, %s, %s", getName(), getMaterial(), getType(), getKey());
    }
}
