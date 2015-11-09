import javax.swing.JOptionPane;

public class StudentDriver
    {
    public static void main ( String[] args)
        {
        Student senior001 = new Student();
        String fname = JOptionPane.showInputDialog("Input Student First Name: ");
        String lname = JOptionPane.showInputDialog("Input Student Last Name: ");
        int studentID = Integer.parseInt(JOptionPane.showInputDialog("Input Student ID Number: "));
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Input Student GPA: "));
        Student junior001 = new Student(fname, lname, studentID, gpa);
        System.out.println(senior001 + "\n\n" + junior001);
        JOptionPane.showMessageDialog(null ,senior001 + "\n\n" + junior001, "Students", JOptionPane.PLAIN_MESSAGE);
        }//end method main
    }//end class StudentDriver