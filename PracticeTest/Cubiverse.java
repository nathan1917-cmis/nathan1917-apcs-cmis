public class Cubiverse
    {
    private String name;
    private int w, h, d, volume;
    private double x, y, z, dfleft, dfbottom, dfback;
    public Cubiverse()
        {
        w = 1;
        h = 1;
        d = 1;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        volume = w * h * d;
        dfleft = w * x;
        dfbottom = h * y;
        dfback = d * z;
        name = "Default Cubiverse -" + Math.random();
        }//end Cubiverse
        
    public Cubiverse(int w, int h, int d, String name)
        {
        this.w = w;
        this.h = h;
        this.d = d;
        volume = w * h * d;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        volume = w * h * d;
        dfleft = w * x;
        dfbottom = h * y;
        dfback = d * z;
        this.name = name;
        }//end Cubiverse
    
    public Cubiverse(double x, double y, double z, String name)
        {
         w = 1;
         h = 1;
         d = 1;
         volume = w * h * d;
         this.x = x;
         this.y = y;
         this.z = z;
         this.name = name;
        }//end Cubiverse
        
    public String toString()
        {
        String output = String.format("Name: %s\n" +
                                "w: %d\n" +
                                "h: %d\n" +
                                "d: %d\n" +
                                "Volume: %d\n" +
                                "x: %.2f\n" +
                                "y: %.2f\n" +
                                "z: %.2f\n" +
                                "Distance from Left: %.2f\n" +
                                "Distance from Bottom: %.2f\n" +
                                "Distance from Back: %.2f\n", name, w, h, d, volume, x, y, z, dfleft, dfbottom, dfback);
        return output;
        }//end toString()
    }//end class Cubiverse