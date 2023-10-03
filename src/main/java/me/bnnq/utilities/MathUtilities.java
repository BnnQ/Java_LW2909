package me.bnnq.utilities;

public class MathUtilities
{
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }
        return result;
    }

}
