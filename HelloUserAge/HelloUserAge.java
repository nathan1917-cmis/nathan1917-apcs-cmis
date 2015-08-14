import javax.swing.JOptionPane;

public class HelloUserAge
    {
    public static void main(String[] args)
        {
        String inputName = JOptionPane.showInputDialog("What is your name?");
        String inputAge = JOptionPane.showInputDialog("How old are you?");
        
        System.out.println("Hello, " + inputName + "! You are " + inputAge + " years old.");
        }
        
    }
    