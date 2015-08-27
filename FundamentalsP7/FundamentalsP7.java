import java.util.Random;

public class FundamentalsP7
    {
    public static void main ( String[] args)
        {
        int loop = 0;
        int[] arrayA = new int[10];
        
        for(int index = 0; index < 10; index ++)
            {
            Random rand = new Random();
            int randNum = rand.nextInt((100 - 0) + 1);
            if(randNum >= 50)
               {
               int finNum = randNum*-1;
               arrayA[index] = finNum;
               }//end if
            else
               {
               int finNum = randNum;
               arrayA[index] = finNum;
               }//end else
             }//end for
        while(loop < 10)
            {
            System.out.println(arrayA[loop]);
            loop++;
            }//end while
        int numPos = 0;
        for(int index = 0; index < arrayA.length; index ++)
            {
            if(arrayA[index] > 0)
                {
                numPos++;
                }//end if
            }//end for
        System.out.println("\n" + "There are " + numPos + " positive integers in the array.");
        }//end method Main
        
        
    }//end class FundamentalsP7