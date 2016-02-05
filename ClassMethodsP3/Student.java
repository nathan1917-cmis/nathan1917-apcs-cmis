public class Student
{
    private String fname;
    private String lname;
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
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = 0.0;
        }//end for
    }//end method Student
    public Student(String fname, String lname, double english, double math, double science, double arts, double socialScience)
    {
        this.fname = fname;
        this.lname = lname;
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = arts;
        grades[4] = socialScience;
    }//end method Student
    public String toString()
    {
        String output = new String();
        output = "Name: " + fname + " " + lname + "\nGPA: " + calcGPA();
        return output;
    }

    public void setGPA(double english, double math, double science, double arts, double socialScience)
    {
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = arts;
        grades[4] = socialScience;;
    }//end method setGPA
    
    public double calcGPA()
    {
        double gpa = 0.0;
        for (int i = 0; i < grades.length; i++)
        {
            gpa += grades[i];
        }//end for
        gpa /= grades.length;
        return gpa;
    }//end method calcGPA
}//end class Student
