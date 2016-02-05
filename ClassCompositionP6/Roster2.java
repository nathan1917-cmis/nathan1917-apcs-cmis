import java.util.ArrayList;
public class Roster2
    {
    private ArrayList<Student> roster = new ArrayList<Student>();
   
    public String findStudentWithMaxGPA()
        {
        double max = 0.0;
        String name = "";
        for (Student s : roster)
            {
            if (s.getGPA() > max)
                {
                 max = s.getGPA();
                 name = s.getName();
                }//end if 
            }//end for each
        return name;
        }//end method findStudentWithMaxGPA
    public void addStudent (Student newStudent)
        {
        roster.add(newStudent);
        }//end addStudent
    public void dropStudent(String lastName)
        {
        for (int i = 0; i < roster.size(); i ++)
            {
            if (roster.get(i).getlName() == lastName)
                {
                roster.remove(i);
                }// end if
            }//end for
           }//end dropStudent
    public String toString()
        {
        int ctr = 1;
        String output = "";
        for (Student s : roster)
           {
            output += "Student " + ctr + ": " + s + "\n";
            ctr ++;
           }
        return output;
        }//end toString
    }//end class Roster2