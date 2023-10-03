package me.bnnq;

public class Security extends Worker
{
    private final Passport passport;

    public Security()
    {
        this("John", "Doe", "Smith", "Security", "IT", "", "", 0, 0, new Passport());
    }

    public Security(String name, String surname, String patronymic, String position, String department, String email, String phoneNumber, int salary, int age, Passport passport)
    {
        super(name, surname, patronymic, position, department, email, phoneNumber, salary, age);
        this.passport = passport;
    }

    public void initialize()
    {
        super.initialize();
        passport.initialize();
    }

    public void print()
    {
        super.print();
        System.out.println(passport);
    }
}
