package me.bnnq;

import me.bnnq.services.EuropeanDateFormatProvider;
import me.bnnq.services.ServiceContainer;
import me.bnnq.services.abstractions.IDateFormatProvider;
import me.bnnq.utilities.ScannerUtilities;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person
{
    private String fullName;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person()
    {
        this("N/A", LocalDate.now(), "N/A", "N/A", "N/A", "N/A");
    }

    public Person(String fullName, LocalDate dateOfBirth, String contactNumber, String city, String country, String homeAddress)
    {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public void initialize()
    {
        System.out.print("Enter full name: ");
        fullName = ScannerUtilities.scanString();

        IDateFormatProvider provider = ServiceContainer.getDateFormatProvider();
        DateTimeFormatter formatter = provider.getFormatter();
        System.out.printf("\nEnter date of birth (format: %s): ", provider.getPattern());
        try {
            dateOfBirth = ScannerUtilities.scanDate(formatter);
        } catch (ParseException exception) {
            System.err.println("Invalid date format!");
            return;
        }

        System.out.print("\nEnter contact number: ");
        contactNumber = ScannerUtilities.scanString();

        System.out.print("\nEnter city: ");
        city = ScannerUtilities.scanString();

        System.out.print("\nEnter country: ");
        country = ScannerUtilities.scanString();

        System.out.print("\nEnter home address: ");
        homeAddress = ScannerUtilities.scanString();
    }

    @Override
    public String toString()
    {
        return "Person: " + fullName + "\nDate of birth: " + dateOfBirth + "\nContact number: " + contactNumber + "\nCity: " + city + "\nCountry: " + country + "\nHome address: " + homeAddress;
    }

    public String getFullName()
    {
        return fullName;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getHomeAddress()
    {
        return homeAddress;
    }

}
