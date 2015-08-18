import javax.swing.JOptionPane;
import java.lang.Math;

public class IfStatements 
    {
    public static void main ( String[] args)
        {
        String cats = JOptionPane.showInputDialog("How many cats do you have?");
        int numberOfCats = Integer.parseInt(cats);
        if (numberOfCats > 2)
            {
            System.out.println(cats + " cats?" + "\n" +"That's just unnecessary");
            } // end if
        else if (numberOfCats <= 0)
            {
            System.out.println(cats + " cats?" + "\n" + "You need a cat in your life");
            } // end else if
        else 
            {
            System.out.println(cats + " cats?" + "\n" + "Perfect.(*There was an opportunity for a pun. I passed it up. You're welcome*)");
            }
        } //end main
    
    } //end class