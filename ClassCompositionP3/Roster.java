import java.util.ArrayList;
public class Roster
    {
    private ArrayList<Student> roster = new ArrayList<Student>();
    
    public Roster()
        {
        roster.add( new Student("Nathan", "LeSeure", 3.78));
        roster.add(new Student("Sheshana", "Jayasekera", 3.8));
        roster.add( new Student("Emi", "Hayakawa", 4.0));
        }//end Roster
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
    public String toString()
        {
        return findStudentWithMaxGPA();
        }//end toString
    }//end class Roster