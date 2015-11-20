import java.util.*;
public class ArrayPractice
{
    public static void main(String[] args)
    {
        /* boundsException()
        int[] values = {1, 4, 9, 16, 25};
        int x = values[5];
        */
        
        // fill()
        int[] values = new int[100];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i * i;
        }
        System.out.println(values);
        System.out.println(Arrays.toString(values));
        
        // findMax() (use public static int findmax())
        int[] valuez = {43, 67, 12, 77, 14, 9};
        int largest = valuez[0];
        for (int i = 1; i < valuez.length; i++)
        {
            if (valuez[i] > largest)
            {
                largest = valuez[i];
            }
        }
        // return largest; (if using public static int findMax())
        System.out.println(largest);
    }
}
