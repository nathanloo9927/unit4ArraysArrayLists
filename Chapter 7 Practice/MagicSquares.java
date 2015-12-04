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
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + "\t");
            }
        }
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int row4 = 0;
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int col4 = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        int j = 0;
        for (int i = 0; i < grid.length; i++)
        {
            row1 += grid[0][i];
        }
        for (int i = 0; i < grid.length; i++)
        {
            row2 += grid[1][i];
        }
        for (int i = 0; i < grid.length; i++)
        {
            row3 += grid[2][i];
        }
        for (int i = 0; i < grid.length; i++)
        {
            row4 += grid[3][i];
        }
        for (int i = 0; i < grid.length; i++)
        {
            col1 += grid[i][0];
        }
        for (int i = 0; i < grid.length; i++)
        {
            col2 += grid[i][1];
        }
        for (int i = 0; i < grid.length; i++)
        {
            col3 += grid[i][2];
        }
        for (int i = 0; i < grid.length; i++)
        {
            col4 += grid[i][3];
        }
        for (int i = 0; i < grid.length; i++)
        {
            diagonal1 += grid[i][i];
        }
        for (int i = 3; i >= grid.length; i--)
        {
            diagonal2 += grid[j][i];
            j++;
        }
    }
}