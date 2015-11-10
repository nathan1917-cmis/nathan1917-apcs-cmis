import java.util.Random;
public class ModifiedSimpleCardDriver
{
    public static void main ( String[] args)
    {
        SimpleCard[] deck = new SimpleCard[52];
        String[] suits = {" Clubs", " Hearts", " Spades", " Diamonds"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Random rand = new Random();
        for (int i = 0; i < 52; i++)
        {
            deck[i] = new SimpleCard(suits[i%4], ranks[i/4]);
        }//end for
        for (int i = 0; i < 5; i++)
        {
            int randInt = rand.nextInt((51 - 0) + 1);
            System.out.println(deck[randInt]);
        }//end for
    }//end method Main
}//end class SimpleCardDriver