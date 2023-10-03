package me.bnnq.utilities;

public class GenericMathUtilities
{
    public static <T extends Comparable<T>> T maximum(T firstParameter, T secondParameter, T thirdParameter)
    {
        T maximum = firstParameter;

        if (secondParameter.compareTo(maximum) > 0)
            maximum = secondParameter;

        if (thirdParameter.compareTo(maximum) > 0)
            maximum = thirdParameter;

        return maximum;
    }

    public static <T extends Comparable<T>> T minimum(T firstParameter, T secondParameter, T thirdParameter, T fourthParameter, T fifthParameter)
    {
        T minimum = firstParameter;

        if (secondParameter.compareTo(minimum) < 0)
            minimum = secondParameter;

        if (thirdParameter.compareTo(minimum) < 0)
            minimum = thirdParameter;

        if (fourthParameter.compareTo(minimum) < 0)
            minimum = fourthParameter;

        if (fifthParameter.compareTo(minimum) < 0)
            minimum = fifthParameter;

        return minimum;
    }

    public static <T extends Number> double average(T[] array)
    {
        double sum = 0.0;

        for (T element : array)
            sum += element.doubleValue();

        return sum / array.length;
    }

    public static <T extends Comparable<T>> T maximumIn(T[] array)
    {
        T maximum = array[0];

        for (T element : array)
            if (element.compareTo(maximum) > 0)
                maximum = element;

        return maximum;
    }

    public static <T extends Comparable<T>> T minimumIn(T[] array)
    {
        T minimum = array[0];

        for (T element : array)
            if (element.compareTo(minimum) < 0)
                minimum = element;

        return minimum;
    }

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int minimum = i;

            for (int j = i + 1; j < array.length; j++)
                if (array[j].compareTo(array[minimum]) < 0)
                    minimum = j;

            T temporary = array[minimum];
            array[minimum] = array[i];
            array[i] = temporary;
        }
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key)
    {
        int left = 0;
        int right = array.length - 1;

        while (right >= left)
        {
            int middle = (left + right) / 2;

            if (key.compareTo(array[middle]) < 0)
                right = middle - 1;
            else if (key.compareTo(array[middle]) == 0)
                return middle;
            else
                left = middle + 1;
        }

        return -1;
    }

}
