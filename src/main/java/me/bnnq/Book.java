package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

public class Book
{
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    public Book()
    {
        this("Unknown", "Unknown", 0, "Unknown", "Unknown", 0);
    }
    
    public Book(String title, String author, int year, String publisher, String genre, int pages)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }
    
    public String toString()
    {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nPublisher: " + publisher + "\nGenre: " + genre + "\nPages: " + pages;
    }
    
    public void initialize()
    {
        System.out.print("Enter the title of the book: ");
        title = ScannerUtilities.scanString();
        System.out.print("\nEnter the author of the book: ");
        author = ScannerUtilities.scanString();
        System.out.print("\nEnter the year of the book: ");
        year = ScannerUtilities.scanInt();
        System.out.print("\nEnter the publisher of the book: ");
        publisher = ScannerUtilities.scanString();
        System.out.print("\nEnter the genre of the book: ");
        genre = ScannerUtilities.scanString();
        System.out.print("\nEnter the number of pages of the book: ");
        pages = ScannerUtilities.scanInt();
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public int getPages()
    {
        return pages;
    }
    
}
