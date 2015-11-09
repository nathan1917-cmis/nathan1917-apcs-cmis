public class Song
    {
    private String title;
    private double length;
    private int year;
    public Song()
        {
        title = "Fight the Power";
        length = 5.24;
        year = 1990;
        }//end Song
    public Song( String title, double length, int year)
        {
        this.title = title;
        this.length = length;
        this.year = year;
        }//end Song
    public String toString()
        {
        String output = new String();
        output = "Title: " + title + "\nLength: " + length + "\nYear: " + year;
        return output;
        }//end to String
    }//end class Song