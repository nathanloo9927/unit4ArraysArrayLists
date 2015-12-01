import java.util.*;
public class MedalCount
{
    final int countries = 7;
    final int medals = 3;
    int[][] counts = {
        {1,0,1},
        {1,1,0},
        {0,0,1},
        {1,0,0},
        {0,1,1},
        {0,1,1},
        {1,1,0}
    };
    public MedalCount()
    {
        // alternative way to initialize a 2D array
        // counts = new int[countries][medals];
        
    }
    public void printTable()
    {
        /* good:
        for (int rows = 0; rows < countries; rows++)
        */
        // better:
        for (int rows = 0; rows < counts.length; rows++)
        {
            // good: for (int columns = 0; columns < medals; columns++)
            // better: for (int columns = 0; columns < counts[0].length; columns++)
            // best:
            for (int columns = 0; columns < counts[rows].length; columns++)
            {
                System.out.print(counts[rows][columns] + "\t");
            }
            System.out.println();
        }
    }
    public int countMedals(int countryName)
    {
        int total = 0;
        for (int columns = 0; columns < counts[countryName].length; columns++)
        {
            total += counts[countryName][columns];
        }
        return total;
    }
    public int countPerMedal(int medalName)
    {
        int total = 0;
        for (int rows = 0; rows < counts.length; rows++)
        {
            total += counts[rows][medalName];
        }
        return total;
    }
}
