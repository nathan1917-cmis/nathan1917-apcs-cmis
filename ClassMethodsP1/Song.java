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
        output = "Title: " + title + "\nLength: " + length + "\nViews: " + views;
        return output;
        }//end to String
    public getYearReleased()
        {
        return getYearReleased;
        }//end getYearReleased
    public setYearReleased(int yearReleased)
        {
        this.yearRe
        }//end setYearReleased
    }//end class Song