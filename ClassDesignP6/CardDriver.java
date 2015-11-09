import java.util.Random;
public class CardDriver
{
    public static void main ( String[] args)
    {
        Card[] hand1 = new Card[2];
        Card[] hand2 = new Card[2];
        Card[] hand3 = new Card[2];
        Card[] hand4 = new Card[2];
        Card[] hand5 = new Card[2];
        Card[] dealer = new Card[2];
        int player1 = 0;
        int player2 = 0;
        int player3 = 0;
        int player4 = 0;
        int player5 = 0;
        int dealerScore = 0;
        String winnerPlayer = "";
        int winnerScore = 0;
        int[] scores = {player1, player2, player3, player4, player5, dealerScore};
        String[] players = {"Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Dealer"};
        Card[][] hands = {hand1, hand2, hand3, hand4, hand5, dealer};
        for (int i = 0; i<hands.length; i++)
        {
            for (int x = 0; x<hands[i].length; x++)
            {
                hands[i][x] = new Card();
            }//end for
        }//end for 
        for (int i = 0; i <hands.length; i++)
        {
            int playerTotal = 0;
            if (i < 5)
            {
                System.out.println("Player " + (i+1) +": ");
            }//end if
            else
            {
                System.out.println("Dealer: ");
            }//end else
            for (int x = 0; x < hands[i].length; x++)
            {
             System.out.println(hands[i][x]);
             
             scores[i] += hands[i][x].score();
            }//end for
            System.out.println("-----------------------------");
            
        }//end for
        System.out.println("\n");
        for (int i = 0; i < players.length; i++)
            {
            System.out.println(players[i] + ": " + scores[i]);
            }//end for
        System.out.println("\n");
        for (int i = 0; i < players.length-1; i++)
            {
            if (scores[i] == 21)
                {
                System.out.println(players[i] + " beats the dealer!");
                }//end if 
            else if (scores[i] > scores[5])
                {
                System.out.println(players[i] + " beats the dealer!");
                }//end if 
            else if (scores[5] >= scores[i])
                {
                System.out.println("The dealer beats " + players[i]);
                }//end if
            }//end for
        
    }//end method main
}//end class CardDriver