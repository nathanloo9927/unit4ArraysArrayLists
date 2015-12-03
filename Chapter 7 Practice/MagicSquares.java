import java.util.*;
public class MagicSquares
{
    public static void main(String[] args)
    {
        int[][] grid = new int[4][4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print("Enter a value for {" + i + "][" + j + "]: ");
                grid[i][j] = scan.nextInt();
            }
        }
    }
}