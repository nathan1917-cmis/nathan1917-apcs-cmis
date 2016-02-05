import javax.swing.JOptionPane;
public class Fibonacci
{
    public static void main (String[] args)
    {
        String input = JOptionPane.showInputDialog("Give me a number: ");
        int num = Integer.parseInt(input);
        java.math.BigInteger[] sequence = new java.math.BigInteger[num];
        sequence[0] = null;
        sequence[1] = null;
        java.math.BigInteger count = ;
        for (int i = 2; i < sequence.length; i++)
            {
            java.math.BigInteger n = sequence[i - 2] + sequence[i - 1];
            sequence[i] = n;
            System.out.println(i  + ": " + sequence[i]);
            }//end for
        for (int i = 0; i < sequence.length; i++)
            {
             if (sequence[i] % 2 == 0)
                {
                count += sequence[i];
                }
            }
        System.out.println("\n\n" + count);
    }//end method Main

}//end class Fibonacci