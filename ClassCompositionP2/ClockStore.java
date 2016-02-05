public class ClockStore
    {
    Clock[] clocksInStock = new Clock[3];
    
    public ClockStore()
        {
        clocksInStock[0] = new Clock(3, 48, 21);
        clocksInStock[1] = new Clock(4, 32, 16);
        clocksInStock[2] = new Clock(9, 58, 27);
        }//end ClockStore
    public int mostSeconds()
        {
        int high = 0;
        int index = 0;
        for (int i = 0; i < clocksInStock.length; i++)
            {            
          if (clocksInStock[i].totalSeconds() > high)
                {
                high = clocksInStock[i].totalSeconds();
                index = i;
                }//end if
            }//end for 
        return index;
        }//end mostSeconds
    public String toString()
        {
        String output = "";
        int ctr = 1;
        for (Clock c : clocksInStock)
           {
           output += "Clock " + ctr + ": " + c + "\n";
           ctr ++;
           }//end for
        return output;
        }//end method toString
    }//end class ClockStore