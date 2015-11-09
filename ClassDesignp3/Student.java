public class Student
    {
    private String fname;
    private String lname;
    private int studentID;
    private double gpa;
    
    public Student()
        {
        fname = "Nathan";
        lname = "LeSeure";
        studentID = 1917;
        gpa = 3.7;
        }//end method Student
    public Student(String fname, String lname, int studentID, double gpa)
        {
        this.fname = fname;
        this.lname = lname;
        this.studentID = studentID;
        this.gpa = gpa;
        }//end method Student
    public String toString()
        {
        String output = new String();
        output = "Name: " + fname + " " + lname + "\nStudent ID: " + studentID + "\nGPA: " + gpa;
        return output;
        }
    }//end class Student
