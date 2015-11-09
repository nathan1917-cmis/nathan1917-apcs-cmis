import javax.swing.JOptionPane;

public class ClockDriver
    {
    public static void main ( String[] args)
        {
        Clock kitchenClock = new Clock();
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Input Hour: "));
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input Mintue: "));
        int second = Integer.parseInt(JOptionPane.showInputDialog("Input Second: "));
        Clock bedroomClock = new Clock(hour, minute, second);
        System.out.println(kitchenClock + "\n" + bedroomClock);
        }//end method main
    }//end class ClockDriver