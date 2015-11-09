public class Clock
    {
    private int hour;
    private int minute;
    private int second;
    public Clock()
        {
        hour = 15;
        minute = 45;
        second = 23;
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
         output = hour + ":" + minute + ":" + second;
         return output;
        }//end toString
    }//end class Clock