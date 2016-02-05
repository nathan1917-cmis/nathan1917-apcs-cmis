public class deck
{
    private int numDecks;
    private int numCards;
    private String[] suits = {"C", "H", "S", "D"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private Card[] cards;
    public Deck()
    {
        Card[] deck = new Card[52];
        String[] suits = {" Clubs", " Hearts", " Spades", " Diamonds"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < 52; i++)
        {
            deck[i] = new Card(suits[i%4], ranks[i/4]);
        }//end for
    }

    public Deck[] shoe(int numDecks)
    {
        Deck[] shoe = new Deck[numDecks];
        for (int i = 0; i < shoe.length; i++)
        {
         shoe[i] = Deck();
        }//end for
    }//end method shoe
    
    
}//end class deck