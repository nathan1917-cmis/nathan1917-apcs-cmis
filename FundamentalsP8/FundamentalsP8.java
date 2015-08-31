import java.util.Random;

public class FundamentalsP8
    {
    public static void main ( String[] args)
        {
        String[] favArtist = {"Neutral Milk Hotel", "Public Enemy", "Giraffes? Giraffes!"};
        for(int index = 0; index < favArtist.length; index++)
            {
            System.out.print(favArtist[index] + ", ");
            }//end for
        Random rand = new Random();
        int randNum = rand.nextInt((2 - 0) + 1);
        favArtist[randNum] = "Michael Jackson";
        System.out.println("\n");
        for(int index = 0; index < favArtist.length; index++)
            {
            System.out.println(favArtist[index]);
            }//end for
        System.out.println("\n");
        for(int index = 0; index < favArtist.length; index++)
            {
            if(favArtist[index].equals("Michael Jackson"))
                {
                System.out.println("We found Michael!");
                    
                }//end if
            else
                {
                System.out.println("No Michael in favArtist[" + index + "]");
                    
                }//end else
              
                
            }//end for
        }//end method Main
        
        
        
    }//end class FundamentalsP8