public class SongDriver
    {
    public static void main ( String[] args)
        {
        Song song1 = new Song();
        System.out.println(song1);
        Song song2 = new Song("Prophets of Rage", 3.19, 1988, "13,425"); 
        System.out.println("\nSetting year to 2000" );
        song1.setYearReleased(2000);
        System.out.println("\n" + song1);
        System.out.println("\nGetting Year: " + song1.getYearReleased());
        }//end method main
    }//end class SongDriver