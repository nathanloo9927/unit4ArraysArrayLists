import java.util.*;
public class ArrayMethods
{
    private int[] values;
    private int currentSize;
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
        for (this.currentSize = 0; this.currentSize < initialValues.length; this.currentSize++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[this.values.length - 1];
        this.values[this.values.length - 1] = temp;
    }
    public void shiftRight()
    {
        int temp = this.values[this.values.length - 1];
        for (int i = this.values.length - 2; i >= 1 ; i--)
        {
            this.values[i] = this.values[i-1];
        }
        this.values[0] = temp;
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
    }
    public void moveEvensToFront()
    {
        int[] temparray = new int[this.values.length];
        for (int i = 0; i < this.values.length; i++)
        {
            if (this.values[i] % 2 == 0)
            {
                temparray[i] = values[i];
            }
        }
    }
}
