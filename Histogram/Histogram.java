import java.util.Random; 
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Histogram
    {
    public static void main ( String[] args)
        {
        String user = JOptionPane.showInputDialog("Input an integer: ");
        int userint = Integer.parseInt(user);
        int[] rands = new int[userint];
        
        for (int index = 0; index < rands.length; index++)
            {
            Random rand = new Random();
            int randNum = rand.nextInt((99 - 0) + 0);
            rands[index] = randNum;
            }//end for
        
        int[] repeat = new int[userint];
        int occurances = 0;
        int numIndex = 0;
        for (int i = 0; i <= 99; i++)
            {
             String hash = "";
             for (int index = 0; index < rands.length; index++)
                {
                 if (rands[index] == i)
                    {
                    hash += "#";
                        
                    }//end if
                    
                    
                }//end for
             if (hash.length() >= occurances)
                {
                occurances = hash.length();
                numIndex = i;
                }//end if
             System.out.println(i + ": " + hash);  
                
            }//end for 
        Arrays.sort(rands);
        System.out.println("MIN: " + rands[0]);
        System.out.println("MAX: " + rands[(rands.length -1)]);
        int sum = 0;
        for (int index = 0; index < rands.length; index++)
            {
            sum += rands[index];
            }//end for
        System.out.println("SUM: " + sum);
        float average = (float) sum / (float) rands.length;
        System.out.println("AVG: " + average);
        System.out.println("MST: " + numIndex);
        }//end method Main
        
        
        
    }//end class Histogram