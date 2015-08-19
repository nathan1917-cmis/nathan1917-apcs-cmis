import javax.swing.JOptionPane;

public class FundamentalsP3
    {
    public static void main ( String[] args)
        {
        String input = JOptionPane.showInputDialog("Input a Number: ");
        int numIn = Integer.parseInt(input);
        
        if (numIn % 2 == 0)
            {
            System.out.println(input + " is an even number."); 
                
            }//end if
        else
            {
            System.out.println(input + " is an odd number.");
                
            }//end else
            
        }//end method main
        
        
    }//end class FundamentalsP3