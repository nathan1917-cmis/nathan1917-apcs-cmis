public class RubberDuck
    {
    private String name;
    private int age;
    public RubberDuck()
        {
        name = "Philip Quackers";
        age = 42;
        }//end method
    public RubberDuck(String name, int age)
        {
         this.name = name;
         this.age = age;
        }//end method
    public String toString()
        {
        String output = new String();
        output = "Name: " + name +"\nAge: " + age + "\n\n";
        return output;
        }//end method
    }//end class Duck