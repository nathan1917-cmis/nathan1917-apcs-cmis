import javax.swing.JOptionPane;
import java.lang.Math;

public class Numbers
    {
    public static void main(String[] args)
        {
        String iOne = JOptionPane.showInputDialog("Pick a number.");
        String iTwo = JOptionPane.showInputDialog("Pick another number.");
        
        double one = Double.parseDouble(iOne);
        double two = Double.parseDouble(iTwo);
        
        double oOne = one + two;
        double oTwo = one - two;
        double oThree = one * two;
        double oFour = one / two;
        double oFive = one % two;
       
        System.out.println(iOne + " + " + iTwo + " = " + oOne + "\n");
        System.out.println(iOne + " - " + iTwo + " = " + oTwo + "\n");
        System.out.println(iOne + " * " + iTwo + " = " + oThree + "\n");
        System.out.println(iOne + " / " + iTwo + " = " + oFour + "\n");
        System.out.println(iOne + " % " + iTwo + " = " + oFive + "\n");

                  
       
        } //end main
        
        
    } //end Numbers