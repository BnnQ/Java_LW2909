package me.bnnq;

import me.bnnq.abstractions.IMath;
import me.bnnq.abstractions.IShow;
import me.bnnq.abstractions.ISortable;
import me.bnnq.utilities.ScannerUtilities;

public class Array<T> implements IShow, IMath<T>, ISortable
{
    private T[] array;


    public Array(int size)
    {
        array = (T[]) new Object[size];
    }
    public Array(T[] array)
    {
        this.array = array;
    }

    public T[] getArray()
    {
        return array;
    }

    public void setArray(T[] array)
    {
        this.array = array;
    }

    public void setValue(int index, T value) {
        array[index] = value;
    }

    public T getValue(int index) {
        return array[index];
    }

    public int getLength() {
        return array.length;
    }

    @Override
    public void print()
    {
        for (T element : array)
        {
            System.out.printf("%s ", element);
        }
    }

    @Override
    public void print(String info) {
        System.out.println(info);
        print();
    }

    public T max()
    {
        T max = array[0];
        for (T element : array)
        {
            if (max.hashCode() < element.hashCode())
            {
                max = element;
            }
        }
        return max;
    }

    public T min()
    {
        T min = array[0];
        for (T element : array)
        {
            if (min.hashCode() > element.hashCode())
            {
                min = element;
            }
        }
        return min;
    }

    public double avg()
    {
        double sum = 0;
        for (T element : array)
        {
            sum += element.hashCode();
        }
        return sum / array.length;
    }

    public void sortAscending()
    {
        for (int i = 1; i < array.length; i++)
        {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].hashCode() > key.hashCode())
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void sortDescending()
    {
        for (int i = 1; i < array.length; i++)
        {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].hashCode() < key.hashCode())
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void fillFromInput()
    {
        for (int i = 0, length = array.length; i < length; i++)
        {
            System.out.printf("Enter #%d element: ", i + 1);
            array[i] = (T) ScannerUtilities.scanString();
        }
    }

    public void fillRandomly()
    {
        for (int i = 0, length = array.length; i < length; i++)
        {
            array[i] = (T) (Integer) ((int) (Math.random() * 21) - 10);
        }
    }

    public T search(T value)
    {
        int left = 0;
        int right = array.length - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (array[middle].hashCode() == value.hashCode())
            {
                return array[middle];
            }
            else if (array[middle].hashCode() < value.hashCode())
            {
                left = middle + 1;
            }
            else if (array[middle].hashCode() > value.hashCode())
            {
                right = middle - 1;
            }
        }
        return null;
    }


}
