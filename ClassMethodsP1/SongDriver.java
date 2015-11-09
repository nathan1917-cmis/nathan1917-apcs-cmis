public class SongDriver
    {
    public static void main ( String[] args)
        {
        Song song1 = new Song();
        System.out.println(song1);
        Song song2 = new Song("Prophets of Rage", 3.19, 1988, "13,425");
        System.out.println("\n" + song2);
        }//end method main
    }//end class SongDriver