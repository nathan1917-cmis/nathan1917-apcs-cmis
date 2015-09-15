import javax.swing.JOptionPane;
import java.util.Random;

public class Histogram
    {
    public static void main ( String[] args)
        {
        String user = JOptionPane.showInputDialog("Input an Integer: ");
        int userInt = Integer.parseInt(user);
        int[] rands = new int[userInt];
        Random randNum = new Random();
        for (int index = 0; index < rands.length; index++)
            {
            rands[index] = randNum.nextInt((99 - 0) + 0);
            System.out.println(rands[index]);
            }//end for
        int[] count = new int[100];
        for (int index = 0; index < rands.length; index++)
            {
            count[rands[index]] += 1;
            
                
            }//end for
        int occurances = 0;
        int numIndex = 0;
        for (int index = 0; index < count.length; index++)
            {
            int ctr = 0;
            String hash = "" ;
            while (ctr < count[index])
                {
                 hash += "#";
                 ctr++;
                }//end while
            if (hash.length() >= occurances)
                {
                occurances = hash.length();
                numIndex = index;
                }//end if 
            System.out.println(index + ": " + hash);
            }//end for 
        int occur = 0;
        for (int index = 0; index < rands.length; index++)
            {
            if (rands[index] > occur)
                {
                 occur = rands[index];
                }//end if
            }//end for
        int nOccur = occur;
        for (int index = 0; index < rands.length; index++)
            {
            if (rands[index] < nOccur)
                {
                nOccur = rands[index];
                }//end if   
            }//end for
        System.out.println("MAX: " + occur);
        System.out.println("MIN: " + nOccur);
        int sum = 0;
        for (int index = 0; index < rands.length; index++)
            {
            sum += rands[index];
            }//end for
        System.out.println("SUM: " + sum);
        float avg = (float) sum / (float) (rands.length);
        System.out.println("AVG: " + avg);
        System.out.println("MST: " + numIndex);
        }//end method Main
        
        
        
    }//end class Histogram 