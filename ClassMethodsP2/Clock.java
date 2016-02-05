public class Clock
    {
    private int hour;
    private int minute;
    private int second;
    public Clock()
        {
        hour = 0;
        minute = 0;
        second = 0;
        }//end Clock
    public Clock(int hour, int minute, int second)
        {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }//end Clock
    public String toString()
        {
         String output = new String();
         output = hour + ":" + minute + ":" + second + "\nTotal Time in Seconds: " + totalSeconds();
         return output;
        }//end toString
    public void setTime(int hour, int minute, int second)
        {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }//end method setTime
    public void convertDaylightSavings(int hours)
        {
        hour += hours;
        }//end method convertDaylightSaving
    public int totalSeconds()
        {
        int output = 0;
        output += hour * 3600;
        output += minute * 60;
        output += second;
        return output;
        }//end method totalSeconds
    }//end class Clock