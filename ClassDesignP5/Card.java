public class Card
    {
    private String suit;
    private int value;
    private String strVal;
    public Card()
        {
        suit = "Spades";
        value = 1;
        }//end method
    public Card(String suit, int value)
        {
        this.suit = suit;
        this.value = value;
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
    }//end class Card