import javax.swing.JOptionPane;

public class FundamentalsP2
    {
    public static void main ( String[] args)
        {
       String a = JOptionPane.showInputDialog("Input a Number: ");
       String b = JOptionPane.showInputDialog("Input another Number: ");
       
       int numA = Integer.parseInt(a);
       int numB = Integer.parseInt(b);
       
       if (numA > numB)
            {
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
            }// end if
       else if (numA < numB)
           {
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b +  ".");
           }// end else
       else
           {
           System.out.println("The valuse of a is " + a + " and it is equal to b whose value is also " + b + ".");    
            }
        }// end method Main
        
    }// end class FundamentalsP2