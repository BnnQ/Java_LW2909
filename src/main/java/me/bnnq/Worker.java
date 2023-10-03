package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Worker
{
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String department;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Worker()
    {
        this("John", "Doe", "Smith", "Worker", "IT", "", "", 0, 0);
    }

    public Worker(String name, String surname, String patronymic, String position, String department, String email, String phoneNumber, int salary, int age)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void initialize() {
        System.out.print("Enter name: ");
        name = ScannerUtilities.scanString();
        System.out.print("Enter surname: ");
        surname = ScannerUtilities.scanString();
        System.out.print("Enter patronymic: ");
        patronymic = ScannerUtilities.scanString();
        System.out.print("Enter position: ");
        position = ScannerUtilities.scanString();
        System.out.print("Enter department: ");
        department = ScannerUtilities.scanString();
        System.out.print("Enter email: ");
        email = ScannerUtilities.scanString();
        System.out.print("Enter phone number: ");
        phoneNumber = ScannerUtilities.scanString();
        System.out.print("Enter salary: ");
        salary = ScannerUtilities.scanInt();
        System.out.print("Enter age: ");
        age = ScannerUtilities.scanInt();
    }

    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
