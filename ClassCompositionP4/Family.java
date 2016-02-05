import java.util.ArrayList;

public class Family
{
    public static void main ( String[] args)
    {
        ArrayList<String> myFamily = new ArrayList<String>();
        
        myFamily.add("Nathan LeSeure");
        myFamily.add("Jason LeSeure");
        myFamily.add("Nick LeSeure");
        myFamily.add("Tony LeSeure");
        
        System.out.println("Number of Family Members: " + myFamily.size());
        
        System.out.println("\nFor Loop: ");
        for (int i = 0; i < myFamily.size(); i ++)
            {
            System.out.println(myFamily.get(i));
            }//end for
        
        System.out.println("\nFor Each Loop: ");
        
        for (String s : myFamily)
            {
            System.out.println( s );
            }//end for each
    }//end method Main
}//end class Family