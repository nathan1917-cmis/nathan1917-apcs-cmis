import javax.swing.JOptionPane;

public class StringStuff 
    {
    public static void main ( String[] args)
        {
        String password = JOptionPane.showInputDialog("What's the password?");
        
        if (password.equals("There is no real super-sand"))
            {
            System.out.println("You must be the real magician");
            }
        else
            {
            System.out.println("Just no...");
            }
            
        } //end method main
        
        
    }//end class StringStuff