import javax.swing.JOptionPane;

public class ClockDriver
    {
    public static void main ( String[] args)
        {
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock + "\n\nSetting time to 1:25:32");
        kitchenClock.setTime(1, 25, 32);
        System.out.println("\n" +kitchenClock);
        kitchenClock.convertDaylightSavings(1);
        System.out.println("\nConverted Forward: " + kitchenClock); 
        }//end method main
    }//end class ClockDriver