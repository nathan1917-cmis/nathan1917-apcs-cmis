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
            System.out.println(rands[index]);
            }//end for
        
        int[] repeat = new int[userint];
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
             
             System.out.println(i + ": " + hash);   
                
            }//end for 
        Arrays.sort(rands);
        for (int index = 0; index < rands.length; index++)
            {
            System.out.println(rands[index]);
            }
        System.out.println("MIN: " + rands[0]);
        System.out.println("MAX: " + rands[(rands.length -1)]);
        
        }//end method Main
        
        
        
    }//end class Histogram