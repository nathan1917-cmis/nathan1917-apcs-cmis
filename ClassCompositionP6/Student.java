public class Student
{
    private String fname;
    private String lname;
    private double gpa;
    public Student()
    {
        fname = "Nathan";
        lname = "LeSeure";
        gpa = 3.78;
    }//end method Student
    public Student(String fname, String lname, double gpa)
    {
        this.fname = fname;
        this.lname = lname;
        this.gpa = gpa;
    }//end method Student
    public String toString()
    {
        String output = fname + " " + lname;
        return output;
    }
    public double getGPA()
        {
        return gpa;
        }//end method getGPA
    public String getName()
        {
        return fname;
        }//end getName
    public String getlName()
        {
        return lname;
        }//end method
}//end class Sudent