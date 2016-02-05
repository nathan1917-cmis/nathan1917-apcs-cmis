public class Roster2Driver
    {
    public static void main ( String[] args)
        {
        Roster2 apComputerScience = new Roster2();
        Student s1 = new Student("Nathan", "LeSeure", 3.78);
        Student s2 = new Student("Sheshana", "Jayasekera", 3.8);
        Student s3 = new Student("Emi", "Hayakawa", 4.0);
        apComputerScience.addStudent(s1);
        apComputerScience.addStudent(s2);
        apComputerScience.addStudent(s3);
        
        System.out.println( apComputerScience );
        
        apComputerScience.dropStudent("LeSeure");
        
        System.out.println(apComputerScience);
        }//end method main
    }//end class