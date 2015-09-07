import javax.swing.JOptionPane;


public class testOne
    {
    public static void main ( String[] args)
        {
        String a = JOptionPane.showInputDialog("Input an Integer: ");
        int numA = Integer.parseInt(a);
        double[] arrayA = new double[numA];
        
        for (int index = 0; index < arrayA.length; index++)
            {
            double randDouble = Math.random() * (50 - 1) + 1 ;
            arrayA[index] = randDouble;
            }//end for
        for (int index = 0; index < arrayA.length; index++)
            {
            System.out.println(index + ": " + arrayA[index]);
                
            }//end for
        for (int index = (arrayA.length - 1); index >= 0; index--)
            {
            int intVal = (int) arrayA[index];
            if (intVal % 2 == 0)
                {
                String e = "E";
                int i = 1;
                while (i < intVal)   
                    {
                    e += "E";
                    i++;
                    }//end while
                System.out.println(index + ": " + e + arrayA[index]);     
                }//end if
            else
                {
                String o = "O";
                int i = 1;
                while ( i < intVal)
                    {
                    o += "O";
                    i++;
                    }//end while
                System.out.println(index + ": " + o + arrayA[index]);
                }//end eles
            
            }//end for   
        }//end method Main
        
        
        
    }//end class testOne