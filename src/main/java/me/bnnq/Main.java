package me.bnnq;

@SuppressWarnings("unused")
public class Main
{
    public static void main(String[] args)
    {
        firstTask();
        //secondTask();
        //thirdTask();
        //fourthTask();
    }

    public static void firstTask()
    {
        Person person = new Person();
        person.initialize();

        System.out.println(person);
    }

    public static void secondTask()
    {
        City city = new City();
        city.initialize();

        System.out.println(city);
    }

    public static void thirdTask()
    {
        Country country = new Country();
        country.initialize();

        System.out.println(country);
    }

    public static void fourthTask()
    {
        Fraction fraction = new Fraction();
        fraction.initialize();

        System.out.println(fraction);

        Fraction fraction2 = new Fraction();
        fraction2.initialize();

        System.out.println(fraction2);

        System.out.printf("\nSum: %s\n", fraction.add(fraction2).simplify());
        System.out.printf("Sub: %s\n", fraction.subtract(fraction2).simplify());
        System.out.printf("Mul: %s\n", fraction.multiply(fraction2).simplify());
        System.out.printf("Div: %s\n", fraction.divide(fraction2).simplify());
    }

}