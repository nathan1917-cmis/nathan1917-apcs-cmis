import javax.swing.JOptionPane;
import java.util.Random;
public class testOne
    {
    public static void main ( String[] args)
        {
        String a = JOptionPane.showInputDialog("Input an Integer: ");
        int numA = Integer.parseInt(a);
        double[] arrayA = new double[numA];
        Random rand = new Random();
        int randInt = rand.nextInt((50 - 1) + 1) + 1;
        double randDouble = (double) randInt;
        for (int index = 0; index < arrayA.length; index++)
            {
            arrayA[index] = randDouble;
            }//end for
        for (int index = 0; index < arrayA.length; index++)
            {
            System.out.println(index + ": " + arrayA[index]);
                
            }//end for
            
        }//end method Main
        
        
        
    }//end class testOne