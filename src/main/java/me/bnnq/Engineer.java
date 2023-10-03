package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Engineer extends Worker
{
    private final Passport passport;
    private String education;
    private String specialization;

    public Engineer()
    {
        this("John", "Doe", "Smith", "Engineer", "IT", "", "", 0, 0, new Passport(), "None", "None");
    }

    public Engineer(String name, String surname, String patronymic, String position, String department, String email, String phoneNumber, int salary, int age, Passport passport, String education, String specialization)
    {
        super(name, surname, patronymic, position, department, email, phoneNumber, salary, age);
        this.passport = passport;
        this.education = education;
        this.specialization = specialization;
    }

    public void initialize()
    {
        super.initialize();
        passport.initialize();
        System.out.print("Enter education: ");
        education = ScannerUtilities.scanString();
        System.out.print("Enter specialization: ");
        specialization = ScannerUtilities.scanString();
    }

    @Override
    public void print()
    {
        super.print();
        System.out.println(passport);

        System.out.println("Education: " + education);
        System.out.println("Specialization: " + specialization);
    }
}
