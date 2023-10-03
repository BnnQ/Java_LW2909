package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Pilot extends Human
{
    private String profession;
    private int salary;

    public Pilot()
    {
        super();
        profession = "Unknown";
        salary = 0;
    }

    public Pilot(String name, int age, String profession, int salary)
    {
        super(name, age);
        this.profession = profession;
        this.salary = salary;
    }

    public void initialize()
    {
        super.initialize();
        System.out.print("Enter profession: ");
        profession = ScannerUtilities.scanString();
        System.out.print("Enter salary: ");
        salary = ScannerUtilities.scanInt();
    }

    public String getProfession()
    {
        return profession;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return String.format("%s, profession: %s, salary: %d", super.toString(), profession, salary);
    }

}
