import java.util.Random;
public class Deck
{
    public deck()
        {
        Card[] deck = new Card[52];
        String[] suits = {" Clubs", " Hearts", " Spades", " Diamonds"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int deckCount = 0;
        Random rand = new Random();
        for (int i = 0; i < suits.length; i++)
        {
            for (int x = 0; x < ranks.length; x++)
            {
                String suit = suits[i];
                String rank = ranks[x];
                Card card = new Card(suit, rank);
                deck[deckCount] = card;
                if (deckCount < 51)
                {
                    deckCount+= 1;
                }//end if 
            }//end for
        }//end for
        }//end deck   

}//end class Deck