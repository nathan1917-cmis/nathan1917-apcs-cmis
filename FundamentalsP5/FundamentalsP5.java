public class FundamentalsP5
    {
    public static void main ( String[] args)
        {
        String fav1 = "The Dirties";
        String fav2 = "Kill Bill Vol. 1";
        String fav3 = "Royal Tenenbaums";
        String favS1 = "Fight the Power";
        String favS2 = "Wide Eyes";
        String favS3 = "Drive Your Funky Soul";
        
        String[] myFav = {fav1, fav2, fav3};
        String[] myFav2 = {favS1, favS2, favS3};
        
        for(int index = 0; index < myFav.length; index++ )
            {
            System.out.println(myFav[index] + "\n");
            }//end for
            
        for(int index = 0; index < myFav2.length; index++ )
            {
            System.out.print(myFav2[index] + ", ");
                
            }
        }//end method Main
        
        
    }//end class FundamentalsP5