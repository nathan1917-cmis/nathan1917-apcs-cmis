import java.util.Random;

public class Card
{
    private String suit;
    private int value;
    private int score;
    private String strVal;
    private Random rand = new Random();
    public Card()
    {
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int randNum = rand.nextInt((3 - 0) + 1);
        int randNumSecond = rand.nextInt((12 - 0) + 1);
        suit = suits[randNum];
        value = values[randNumSecond];
        
        if (value == 1)
                {
                 score += 11;
             
                }//end else
        if (value < 10 && value > 1)
            {
            score += value;
            }//end if 
        else if (value >= 10)
            {
            score += 10;
            }//end if 
        Card newCard = new Card(suit, value, score);
    }//end method
    public Card(String suit, int value, int score)
    {
        this.suit = suit;
        this.value = value;
        this.score = score;
    }//end method
    public String toString()
    {
        String output = new String();

        if (value == 1)
        {
            strVal = "A";
            output = strVal + " of " + suit;
           
        }//end if
        else if (value == 11)
        {
            strVal = "J";
            output = strVal + " of " + suit;
            
        }//end else if
        else if (value == 12)
        {
            strVal = "Q";
            output = strVal + " of " + suit;
            
        }//end else if
        else if (value == 13)
        {
            strVal = "K";
            output = strVal + " of " + suit;
           
        }//end else if
        else
        {
            output = value + " of " + suit;
            
        }
        return output;
            }//end method
    public int score()
        {
        int finalScore = score;
        return finalScore;
        }//end method score
}//end class Card