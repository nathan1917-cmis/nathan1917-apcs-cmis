import javax.swing.JOptionPane;
import java.util.Random;
public class weatherChaos
    {
    public static void main ( String[] args)
        {
        int user = Integer.parseInt(JOptionPane.showInputDialog("Input a Number of Days: "));
        int[] temps = new int[user];
        int day;
        int swing;
        System.out.println("Day\tTemp\tSwing\tDescription");
        for (int i = 0; i < temps.length; i++)
            {
            temps[i] = (int) (Math.random() * 200) - 100;
            day = i + 1;
            if (i > 0)
                {
                swing = temps[i] - temps[i - 1];
                }//end if
            else
                {
                swing = 0;
                }//end else
            System.out.println(day + "\t" + temps[i] + "\t" + swing); 
            }//end for
        }//end method main
    }//end class weatherChaos