package me.bnnq.abstractions;

public abstract class MusicalInstrument
{
    private String name;
    private String type;


    public MusicalInstrument(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public MusicalInstrument()
    {
        this("", "");
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public abstract void desc();

    public abstract void sound();

    public void show()
    {
        System.out.println(name);
    }

    public abstract void history();

    @Override
    public String toString()
    {
        return String.format("MusicalInstrument: %s, type: %s", name, type);
    }
}
