import javax.swing.JOptionPane;
import java.util.Random;
public class weatherChaos
    {
    public static void main ( String[] args)
        {
        int user = Integer.parseInt(JOptionPane.showInputDialog("Input a Number of Days: "));
        if (user > 0 && user <= 31)
            {
            int[] temps = new int[user];
            int day;
            int swing;
            int max = 0;
            int maxDay = 0;
            int minDay = 0;
            int min = 99;
            int maxSwing = 0;
            int maxSwingDay = 0;
            int total = 0;
            String description;
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
                if (temps[i] < 0)
                    {
                    description = "Freezing";
                    }//end if
                else if (temps[i] > 0 && temps[i] <= 15)
                    {
                    description = "Chilly";
                    }//end else if
                else if (temps[i] > 15 && temps[i] <=30)
                    {
                    description = "Comfortable";
                    }//end else if
                else if (temps[i] > 30 && temps[i] <= 40)
                    {
                    description = "Hot";
                    }//end else if
                else
                    {
                    description = "AHHHHHH!!!";
                    }//end else
                if (temps[i] > max)
                    {
                    max = temps[i];
                    maxDay = i + 1;
                    }//end if
                if (temps[i] < min)
                    {
                    min = temps[i];
                    minDay = i + 1;
                    }//end if
                if (swing > maxSwing)
                    {
                    maxSwing = swing;
                    maxSwingDay = i + 1;
                    }//end if
                total += temps[i];
                System.out.println(day + "\t" + temps[i] + "\t" + swing + "\t" + description);
                }//end for
            System.out.println("The maximum temperature was " + max + " on day " + maxDay);
            System.out.println("The minimum temperature was " + min + " on day " + minDay);
            System.out.println("The average temperature was " + (double) (total) / (double) user);
            System.out.println("The biggest temperature swing was " + maxSwing + " between days " + (maxSwingDay - 1) + " and " + maxSwingDay);
        }//end if
        else
            {
            System.out.println("Not a valid number of days!");
            }//end else
        }//end method main
    }//end class weatherChaos