import java.util.*;
public class ArrayMethods
{
    private int[] values;
    private int currentSize;
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
        this.currentSize = this.values.length;
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[this.values.length - 1];
        this.values[this.values.length - 1] = temp;
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(this.values[i] + " ");
        }
    }
    public void shiftRight()
    {
        int temp = this.values[this.values.length - 1];
        for (int i = this.values.length - 1; i >= 1 ; i--)
        {
            this.values[i] = this.values[i-1];
        }
        this.values[0] = temp;
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(this.values[i] + " ");
        }
    }
    public void replaceEvens()
    {
        for (int i = 0; i < this.values.length; i++)
        {
            if (this.values[i] % 2 == 0)
            {
                this.values[i] = 0;
            }
        }
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(this.values[i] + " ");
        }
    }
    public void replaceWithLarger()
    {
        /*
        for (int i = 1; i < this.values.length - 1; i++)
        {
            int templeft = this.values[i-1];
            int tempright = this.values[i+1];
            
        }
        */
    }
    public void removeMiddle()
    {
        if (this.values.length % 2 == 0)
        {
            int middle = this.values.length / 2;
            for (int i = middle + 1; i < this.values.length; i++)
            {
                this.values[i-2] = this.values[i];
            }
            this.currentSize -= 2;
        }
        else
        {
            int middle = this.values.length / 2;
            for (int i = middle + 1; i < this.values.length; i++)
            {
                this.values[i-1] = this.values[i];
            }
            this.currentSize--;
        }
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(this.values[i] + " ");
        }
    }
    public void moveEvensToFront()
    {
        int[] temparray = new int[this.currentSize];
        for (int i = 0; i < this.values.length; i++)
        {
            if (this.values[i] % 2 == 0)
            {
                //temparray[i] = this.values[i];
            }
        }
        for (int i = 0; i < this.values.length; i++)
        {
            if (this.values[i] % 2 != 0)
            {
                //temparray[i] = this.values[i];
            }
        }
        for (int i = 0; i < this.currentSize; i++)
        {
            System.out.print(temparray[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arrayA = {0,1,4,9,16,25};
        int[] arrayB = {0,1,4,9,16,25};
        int[] arrayC = {0,1,4,9,16,25};
        int[] arrayD = {0,1,4,9,16,25};
        int[] arrayE = {0,1,4,9,16,25};
        ArrayMethods array1 = new ArrayMethods(arrayA);
        ArrayMethods array2 = new ArrayMethods(arrayB);
        ArrayMethods array3 = new ArrayMethods(arrayC);
        ArrayMethods array4 = new ArrayMethods(arrayD);
        ArrayMethods array5 = new ArrayMethods(arrayE);
        System.out.println("The results after: ");
        System.out.print("Reversing switch first and last: ");
        array1.swapFirstAndLast();
        System.out.println();
        System.out.print("Shifting all elements except the last one right. put the last element first: ");
        array2.shiftRight();
        System.out.println();
        System.out.print("Replacing all even elements with 0: ");
        array3.replaceEvens();
        System.out.println();
        System.out.print("Removing the middle element: ");
        array4.removeMiddle();
        System.out.println();
        System.out.print("Moving the evens to the front: ");
        array5.moveEvensToFront();
    }
}
