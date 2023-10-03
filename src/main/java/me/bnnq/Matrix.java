package me.bnnq;

import me.bnnq.utilities.ScannerUtilities;

import java.util.function.Supplier;

public class Matrix<T extends Number>
{
    private T[][] matrix;

    public Matrix(int rows, int columns)
    {
        matrix = (T[][]) new Number[rows][columns];
    }

    public Matrix(T[][] matrix)
    {
        this.matrix = matrix;
    }

    public T[][] getMatrix()
    {
        return matrix;
    }

    public void setMatrix(T[][] matrix)
    {
        this.matrix = matrix;
    }

    public void setValue(int row, int column, T value)
    {
        matrix[row][column] = value;
    }

    public T getValue(int row, int column)
    {
        return matrix[row][column];
    }

    public int getRows()
    {
        return matrix.length;
    }

    public int getColumns()
    {
        return matrix[0].length;
    }

    public void fill(Supplier<T> supplier) {
        for (int row = 0, rows = getRows(); row < rows; row++) {
            for (int column = 0, columns = getColumns(); column < columns; column++) {
                matrix[row][column] = supplier.get();
            }
        }
    }


    public void fillFromInput()
    {
        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                matrix[row][column] = (T) (Number) ScannerUtilities.scanDouble();
            }
        }
    }

    public void print()
    {
        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                System.out.printf("%s ", matrix[row][column]);
            }
            System.out.println();
        }
    }

    public void print(String info)
    {
        System.out.println(info);
        print();
    }

    public Matrix<T> add(Matrix<T> matrix)
    {
        Matrix<T> result = new Matrix<>(getRows(), getColumns());

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                result.setValue(row, column, (T) (Number) (this.matrix[row][column].doubleValue() + matrix.getValue(row, column).doubleValue()));
            }
        }

        return result;
    }

    public Matrix<T> subtract(Matrix<T> matrix)
    {
        Matrix<T> result = new Matrix<>(getRows(), getColumns());

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                result.setValue(row, column, (T) (Number) (this.matrix[row][column].doubleValue() - matrix.getValue(row, column).doubleValue()));
            }
        }

        return result;
    }

    public Matrix<T> multiply(Matrix<T> matrix)
    {
        Matrix<T> result = new Matrix<>(getRows(), getColumns());

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                result.setValue(row, column, (T) (Number) (this.matrix[row][column].doubleValue() * matrix.getValue(row, column).doubleValue()));
            }
        }

        return result;
    }

    public Matrix<T> divide(Matrix<T> matrix)
    {
        Matrix<T> result = new Matrix<>(getRows(), getColumns());

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                result.setValue(row, column, (T) (Number) (this.matrix[row][column].doubleValue() / matrix.getValue(row, column).doubleValue()));
            }
        }

        return result;
    }

    public T max()
    {
        T max = matrix[0][0];

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                if (max.doubleValue() < matrix[row][column].doubleValue())
                {
                    max = matrix[row][column];
                }
            }
        }

        return max;
    }

    public T min()
    {
        T min = matrix[0][0];

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                if (min.doubleValue() > matrix[row][column].doubleValue())
                {
                    min = matrix[row][column];
                }
            }
        }

        return min;
    }

    public double avg()
    {
        double sum = 0;

        for (int row = 0, rows = getRows(); row < rows; row++)
        {
            for (int column = 0, columns = getColumns(); column < columns; column++)
            {
                sum += matrix[row][column].doubleValue();
            }
        }

        return sum / (getRows() * getColumns());
    }
}