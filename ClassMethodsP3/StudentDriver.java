import javax.swing.JOptionPane;

public class StudentDriver
    {
    public static void main ( String[] args)
        {
        Student senior = new Student("Joe", "Senior",  4.0, 4.0, 3.5, 4.0, 4.0); 
        System.out.println(senior);
        senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        System.out.println(senior);
        }//end method main
    }//end class StudentDriver