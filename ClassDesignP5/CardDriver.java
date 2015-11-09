import java.util.Random;
public class CardDriver
    {
    public static void main ( String[] args)
        {
        Card[] myHand = new Card[50];
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Random rand = new Random();
        String suit;
        int value;
        for (int i = 0; i < 50; i++)
            {
            int randNum = rand.nextInt((3 - 0) + 1);
            int randNumSecond = rand.nextInt((12 - 0) + 1);
            suit = suits[randNum];
            value = values[randNumSecond];
            Card newCard = new Card(suit, value);
            myHand[i] = newCard;
            System.out.println(myHand[i]);
            }//end for 
        
        }//end method main
    }//end class CardDriver