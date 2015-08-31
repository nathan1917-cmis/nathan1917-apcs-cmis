import javax.swing.JOptionPane;

public class FundamentalsP9
    {
    public static void main ( String[] args)
        {
        String inputA = JOptionPane.showInputDialog("Input a Username: ");
        String inputB = JOptionPane.showInputDialog("Input a Password (Integers Only): ");
        
        int pass = Integer.parseInt(inputB);
        
        if(inputA.equals("yes") && pass == 54637)
            {
            System.out.println("You have successfully logged in.");
                
            }//end for
        else
            {
            System.out.println("Login Unsuccessful...try again.");
                
            }//end else
            
            
            
        }//end method Main
        
        
        
        
    }//end class FundamentalsP9