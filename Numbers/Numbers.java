import javax.swing.JOptionPane;
import java.lang.Math;

public class Numbers
    {
    public static void main(String[] args)
        {
        String iOne = JOptionPane.showInputDialog("Pick a number.");
        String iTwo = JOptionPane.showInputDialog("Pick another number.");
        
        float one = Float.parseFloat(iOne);
        float two = Float.parseFloat(iTwo);
        
        float oOne = one + two;
        float oTwo = one - two;
        float oThree = one * two;
        float oFour = one / two;
        float oFive = one % two;
       
        System.out.println(iOne + " + " + iTwo + " = " + oOne + "\n");
        System.out.println(iOne + " - " + iTwo + " = " + oTwo + "\n");
        System.out.println(iOne + " * " + iTwo + " = " + oThree + "\n");
        System.out.println(iOne + " / " + iTwo + " = " + oFour + "\n");
        System.out.println(iOne + " % " + iTwo + " = " + oFive + "\n");

                  
       
        } //end main
        
        
    } //end Numbers