package me.bnnq;

import me.bnnq.abstractions.Device;
import me.bnnq.abstractions.Shape;
import me.bnnq.enums.VolumeUnit;
import me.bnnq.utilities.AreaMath;
import me.bnnq.utilities.MathUtilities;

@SuppressWarnings("unused")
public class Main
{
    public static void main(String[] args)
    {
        task22();
    }

    public static void task1()
    {
        Person person = new Person();
        person.initialize();

        System.out.println(person);
    }

    public static void task2()
    {
        City city = new City();
        city.initialize();

        System.out.println(city);
    }

    public static void task3()
    {
        Country country = new Country();
        country.initialize();

        System.out.println(country);
    }

    public static void task4()
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

    public static void task5()
    {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Allen & Unwin", "Fantasy", 1178);
        System.out.println(book);
        book.initialize();
        System.out.println(book);
    }

    public static void task6()
    {
        Car car = new Car("X5", "BMW", 2018, 3.0);
        System.out.println(car);

        System.out.println("Engine volume in cubic centimeters: " + car.getEngineVolume(VolumeUnit.CUBIC_CENTIMETER));
        System.out.println("Engine volume in cubic meters: " + car.getEngineVolume(VolumeUnit.CUBIC_METER));
    }

    public static void task7()
    {
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println("Total number of instances: " + Person.getInstanceCount());
    }

    public static void task8()
    {
        double side = 5;
        System.out.printf("Area of square with side %.1f: %.1f\n", side, AreaMath.getSquareArea(side));

        double a = 3, b = 4, c = 5;
        System.out.printf("Area of triangle with sides %.1f, %.1f, %.1f: %.1f\n", a, b, c, AreaMath.getTriangleArea(a, b, c));

        double width = 3, height = 4;
        System.out.printf("Area of rectangle with width %.1f and height %.1f: %.1f\n", width, height, AreaMath.getRectangleArea(width, height));

        double firstDiagonal = 3, secondDiagonal = 4;
        System.out.printf("Area of rhombus with first diagonal %.1f and second diagonal %.1f: %.1f\n", firstDiagonal, secondDiagonal, AreaMath.getRhombusArea(firstDiagonal, secondDiagonal));

        System.out.printf("Total number of calculations: %d\n", AreaMath.getNumberOfCalculations());
    }

    public static void task9()
    {
        System.out.println("Max of 1, 2, 3, 4: " + MathUtilities.max(1, 2, 3, 4));
        System.out.println("Min of 1, 2, 3, 4: " + MathUtilities.min(1, 2, 3, 4));
        System.out.println("Average of 1, 2, 3, 4: " + MathUtilities.average(1, 2, 3, 4));
        System.out.printf("%d! = %d", 4, MathUtilities.factorial(4));
    }

    public static void task10()
    {
        Builder builder = new Builder();
        System.out.println("Initializing builder");
        builder.initialize();
        System.out.println(builder);

        Sailor sailor = new Sailor();
        System.out.println("\nInitializing sailor");
        sailor.initialize();
        System.out.println(sailor);

        Pilot pilot = new Pilot();
        System.out.println("\nInitializing pilot");
        pilot.initialize();
        System.out.println(pilot);
    }

    public static void task11()
    {
        Passport passport = new Passport();
        passport.initialize();
        System.out.println(passport);

        ForeignPassport foreignPassport = new ForeignPassport();
        foreignPassport.initialize();
        System.out.println(foreignPassport);
    }

    public static void task12()
    {
        President president = new President();
        president.initialize();
        president.print();

        Security security = new Security();
        security.initialize();
        security.print();

        Manager manager = new Manager();
        manager.initialize();
        manager.print();

        Engineer engineer = new Engineer();
        engineer.initialize();
        engineer.print();
    }

    public static void task13()
    {
        Shape[] shapes = new Shape[]{new Circle(5), new Rectangle(5, 10), new RightTriangle(3, 4), new Trapezoid(3, 4, 5)};
        for (Shape shape : shapes)
        {
            System.out.printf("Area of %s: %.2f\n", shape.getClass().getSimpleName(), shape.getArea());
        }
    }

    public static void task14()
    {
        Array<Integer> array = new Array<>(5);
        for (int i = 0, length = array.getLength(); i < length; i++)
        {
            array.setValue(i, i);
        }

        array.print("Array: ");
    }

    public static void task15()
    {
        Animal animal = new Tiger("Tiger", 5);
        animal.eat();

        Crocodile crocodile = new Crocodile("Crocodile", 10);
        crocodile.eat();
        crocodile.swim();

        Kangaroo kangaroo = new Kangaroo("Kangaroo", 2);
        kangaroo.eat();
        kangaroo.jump();
    }

    public static void task16()
    {
        Product product = new Product("Product", new Money(10, 10), 10);
        System.out.println(product);

        product.increasePrice(new Money(3, 20));
        System.out.println(product);

        product.decreasePrice(new Money(6, 50));
        System.out.println(product);
    }

    public static void task17()
    {
        Device device = new Kettle("Kettle", 5, 5);
        device.desc();

        Steamer steamer = new Steamer("Steamer", 15, 95);
        steamer.desc();
        steamer.sound();

        Microwave microwave = new Microwave("Microwave", 6, 3);
        microwave.desc();
        microwave.sound();
    }

    public static void task18()
    {
        Violin violin = new Violin("Violin", "Stradivari", "G");
        violin.desc();
        violin.sound();
        violin.history();

        Trombone trombone = new Trombone("Trombone", "Yamaha", "Brass", "Tenor", "Bb");
        trombone.desc();
        trombone.sound();
        trombone.history();

        Ukulele ukulele = new Ukulele("Ukulele", "Kala", "Mahogany", "Soprano", "C");
        ukulele.desc();
        ukulele.sound();
        ukulele.history();
    }

    public static void task19()
    {
        Array<Integer> array = new Array<>(5);

        for (int i = 0, length = array.getLength(); i < length; i++)
        {
            array.setValue(i, (int) (Math.random() * 21) - 10);
        }

        array.print("Array: ");
        System.out.printf("\nMin element from array: %d\n", array.min());
        System.out.printf("Max element from array: %d\n", array.max());
        System.out.printf("Average of array: %f\n", array.avg());
    }

    public static void task20()
    {
        Array<Integer> array = new Array<>(5);

        for (int i = 0, length = array.getLength(); i < length; i++)
        {
            array.setValue(i, (int) (Math.random() * 21) - 10);
        }

        array.print("\nArray before ascending sort: ");
        array.sortAscending();
        array.print("\nArray after ascending sort: ");
        array.sortDescending();
        array.print("\nArray after descending sort");
    }

    public static void task21()
    {
        Array<Integer> array = new Array<>(5);
        array.fillRandomly();
        array.print("Array of random numbers: ");

        array.setValue(0, 1000);
        array.print("\nArray after setting 1000 to first element: ");
    }

    public static void task22() {
        Matrix<Integer> matrix = new Matrix<>(3, 3);
        matrix.fill(() -> (int) (Math.random() * 21) - 10);

        matrix.print("Matrix: ");

        System.out.printf("Average of elements: %f\n", matrix.avg());
        System.out.printf("Min element: %s\n", matrix.min());
        System.out.printf("Max element: %s\n", matrix.max());
    }

}