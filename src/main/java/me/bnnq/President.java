package me.bnnq;

public class President extends Worker
{
    private final ForeignPassport foreignPassport;

    public President()
    {
        this("John", "Doe", "Smith", "President", "IT", "", "", 0, 0, new ForeignPassport());
    }

    public President(String name, String surname, String patronymic, String position, String department, String email, String phoneNumber, int salary, int age, ForeignPassport foreignPassport)
    {
        super(name, surname, patronymic, position, department, email, phoneNumber, salary, age);
        this.foreignPassport = foreignPassport;
    }

    public void initialize()
    {
        super.initialize();
        foreignPassport.initialize();
    }

    public void print()
    {
        super.print();
        System.out.println(foreignPassport);
    }
}
