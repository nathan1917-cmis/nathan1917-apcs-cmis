import java.util.Arrays;
public class Swapper
{
    public static void main ( String[] args)
    {
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        int[] rowP = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] colP = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int rowIndex = 0;
        int colIndex = 0;
        int rowMax = 0;
        int colMax = 0 ;
        
        System.out.println("Original Grid:\n");
        for (int i = 0; i < grid.length; i++)
        {
            for (int x = 0; x < grid[i].length; x++)
            {
                if (grid[i][x] != 0)
                {
                    rowP[i] *= grid[i][x];
                }//end if
                if (grid[x][i] != 0)
                {
                    colP[i] *= grid[x][i];
                }//end if
                System.out.print(grid[i][x] + " ");
            }//end inner for
            System.out.println();
        }//end outer for
        
        System.out.println("\n\n");
        
        for (int i = 0; i < rowP.length; i++)
        {
            if (rowP[i] > rowMax)
            {
                rowMax = rowP[i];
                rowIndex = i;
            }//end if
            if (colP[i] > colMax)
                {
                colMax = colP[i];
                colIndex = i;
                }//end if
        }//end for 
        
        System.out.println("Modified Grid:\n");
        
        for (int i = 0; i < grid.length; i++)
        {
            for (int x = 0; x < grid[i].length; x++)
            {
                if (grid[i][x] == 0)
                {
                    grid[i][x] = grid[rowIndex][colIndex];
                }//end if
                else if (grid[i][x] == grid[rowIndex][colIndex])
                    {
                     grid[i][x] = 0;
                    }//end else if
                System.out.print(grid[i][x] + " ");
            }//end inner for
            System.out.println();
        }//end outer for
        
    }//end method Main
}//end class Swapper