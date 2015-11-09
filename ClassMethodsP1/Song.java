public class Song
    {
    private String title;
    private double length;
    private String views;
    private int yearReleased;
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
        this.yearReleased = yearReleased;
        }//end setYearReleased
        }//end class Song