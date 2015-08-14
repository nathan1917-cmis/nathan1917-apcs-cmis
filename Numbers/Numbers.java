import javax.swing.JOptionPane;
import java.lang.Math;

public class Numbers
    {
    public static void main(String[] args)
        {
        String iOne = JOptionPane.showInputDialog("Pick a number.");
        String iTwo = JOptionPane.showInputDialog("Pick another number.");
        
        int one = Integer.parseFloat(iOne);
        int two = Integer.parseFloat(iTwo);
        
        int oOne = one + two;
        int oTwo = one - two;
        int oThree = one * two;
        int oFour = one / two;
        int oFive = one % two;
       
        System.out.println(iOne + " + " + iTwo + " = " + oOne + "\n");
        System.out.println(iOne + " - " + iTwo + " = " + oTwo + "\n");
        System.out.println(iOne + " * " + iTwo + " = " + oThree + "\n");
        System.out.println(iOne + " / " + iTwo + " = " + oFour + "\n");
        System.out.println(iOne + " % " + iTwo + " = " + oFive + "\n");

                  
       
        }
        
        
    }