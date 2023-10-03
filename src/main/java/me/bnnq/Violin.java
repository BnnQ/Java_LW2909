package me.bnnq;

import me.bnnq.abstractions.MusicalInstrument;

public class Violin extends MusicalInstrument
{
    private String sound;

    public Violin(String name, String type, String sound)
    {
        super(name, type);
        this.sound = sound;
    }

    public Violin()
    {
        this("", "", "");
    }

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    @Override
    public void desc() {
        System.out.println("This is a violin");
    }

    @Override
    public void sound()
    {
        System.out.println("Violin sound");
    }


    @Override
    public void history()
    {
        System.out.println("Violin history");
    }

    @Override
    public String toString()
    {
        return String.format("Violin: %s, type: %s, sound: %s", getName(), getType(), sound);
    }
}
