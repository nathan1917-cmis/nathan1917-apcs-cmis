public class Student
    {
    private String fname;
    private String lname;
    private int studentID;
    private double gpa;
    private double english;
    private double math;
    private double science;
    private double arts;
    private double socialScience;
    private double[] grades = new double[5];
    
    public Student()
        {
        fname = "Nathan";
        lname = "LeSeure";
        studentID = 1917;
        gpa = 0.0;
        for (int i = 0; i < grades.length; i++)
            {
            grades[i] = 0.0;
            }//end for
        }//end method Student
    public Student(String fname, String lname, int studentID, double gpa, double english, double math, double science, double arts, double socialScience)
        {
        this.fname = fname;
        this.lname = lname;
        this.studentID = studentID;
        this.gpa = gpa;
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = arts;
        grades[4] = socialScience;
        }//end method Student
    public String toString()
        {
        String output = new String();
        output = "Name: " + fname + " " + lname + "\nStudent ID: " + studentID + "\nGPA: " + gpa;
        return output;
        } //end method toString
    
    }//end class Student
