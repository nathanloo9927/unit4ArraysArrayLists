import java.util.*;
public class Store
{
    private ArrayList<Customer> store;
    public Store()
    {
        store = new ArrayList<Customer>();
    }
    public void addSale(String customerName, double amount)
    {
        Customer customer = new Customer(customerName, amount);
        store.add(customer);
    }
    public String nameOfBestCustomer()
    {
        Customer bestCustomer = new Customer("",0);
        double largest = 0;
        for (Customer customer : store)
        {
            if (customer.getCustomerAmount() > largest)
            {
                largest = customer.getCustomerAmount();
                bestCustomer = customer;
            }
        }
        return bestCustomer.getCustomerName();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int sentinel = 1;
        while (sentinel != 0)
        {
            System.out.print("Please enter the customer's name: ");
            String name = scan.next();
            System.out.print("Please enter the amount the customer paid: ");
            double payment = scan.nextDouble();
            double pay = Math.round(payment * 100d) / 100d;
            System.out.print("Enter another customer? (0 = no): ");
            store.addSale(name,pay);
            sentinel = scan.nextInt();
        }
        System.out.println("The best customer is " + store.nameOfBestCustomer());
    }
}
