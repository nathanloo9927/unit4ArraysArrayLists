import java.util.*;
public class ArrayOperations
{
    public static void main(String[] args)
    {
        int[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Length: " + x.length);
        System.out.println();
        System.out.println("First: "+ x[0]);
        System.out.println();
        System.out.println("Last: " + x[8]);
        System.out.println();
        System.out.println("x[x.length - 1]: " + x[x.length - 1]);
        System.out.println();
        for (int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        System.out.println();
        System.out.println("Element\tNumber");
        for (int i = 0; i < x.length; i++)
        {
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();
        System.out.println("Reverse!");
        for (int i = 8; i >= 0; i--)
        {
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();
        for (int value : x)
        {
            System.out.println(value);
        }
    }
}
