package me.bnnq;

public class Product
{
    private String name;
    private Money price;
    private int quantity;

    public Product(String name, Money price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product()
    {
        this("", new Money(), 0);
    }

    public String getName()
    {
        return name;
    }

    public Money getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void increasePrice(Money money)
    {
        price.add(money.getWhole(), money.getPenny());
    }

    public void decreasePrice(Money money)
    {
        price.subtract(money.getWhole(), money.getPenny());
    }

    @Override
    public String toString()
    {
        return String.format("Product: %s, price: %s, quantity: %d", name, price, quantity);
    }
}
