package me.bnnq.utilities;

import java.io.InputStream;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerUtilities {
    private static Scanner scanner = new Scanner(System.in);

    public static int scanInt() {
        return Integer.parseInt(scanString());
    }

    public static double scanDouble() {
        return Double.parseDouble(scanString());
    }

    public static String scanString() {
        return scanner.nextLine();
    }

    public static char scanChar() {
        return scanString().charAt(0);
    }

    public static LocalDate scanDate(DateTimeFormatter formatter) throws ParseException
    {
        String dateString = scanString();
        return LocalDate.parse(dateString, formatter);
    }

    public static int[] scanIntArray(int numberOfElements) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Enter #%d element: ", i + 1);
            array[i] = scanInt();
        }

        return array;
    }

    /**
     * @param stream The stream to change to (default is System.in)
     */
    public static void changeStream(InputStream stream) {
        scanner = new Scanner(stream);
    }
}
