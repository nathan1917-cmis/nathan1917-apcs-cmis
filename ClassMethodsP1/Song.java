import javax.swing.JOptionPane;
public class Song
    {
    private String title;
    private double length;
    private String views;
    private int yearReleased;
    private String user;
    private String pass;
    public Song()
        {
        title = "Fight the Power";
        length = 5.24;
        views = "7,657,845";
        yearReleased = 1990;
        }//end Song
    public Song( String title, double length, int yearReleased, String views)
        {
        this.title = title;
        this.length = length;
        this.yearReleased = yearReleased;
        this.views = views;
        }//end Song
    public String toString()
        {
        String output = new String();
        output = "Title: " + title + "\nLength: " + length + "\nYear Released: " + yearReleased + "\nViews: " + views;
        return output;
        }//end to String
    public int getYearReleased()    
        {
        int output = yearReleased;
        return output;
        }//end getYearReleased
    public void setYearReleased(int yearReleased)
        {
        user = JOptionPane.showInputDialog("Input Username: ");
        pass = JOptionPane.showInputDialog("Input Password: ");
        if (user.equals("nathan") && pass.equals("1"))
            {
            this.yearReleased = yearReleased;
            }//end if
        else
            {
             System.out.println("Incorrect Username and/or Password...cannot set");
            }//end else
        
        }//end setYearReleased
        }//end class Song