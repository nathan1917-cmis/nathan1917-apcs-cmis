import java.util.Random;

public class FundamentalsP4
    {
    public static void main ( String[] args)
        {
        for(int num = 1; num <= 10; num++ )
            {
                Random rand = new Random();
                int numS = num*num;
                int randNum = rand.nextInt((numS - num) + 1) + num;
                System.out.println(num + "\t" + numS + "\t" + randNum); 
                
            }//end for
        }//end method Main
        
        
    }//end class FundamentalsP4