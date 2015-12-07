import java.util.*;
public class Customer
{
    private String name;
    private double amount;
    public Customer(String name, double price)
    {
        this.name = name;
        this.amount = price;
    }
    public String getCustomerName()
    {
        return this.name;
    }
    public double getCustomerAmount()
    {
        return this.amount;
    }
}
