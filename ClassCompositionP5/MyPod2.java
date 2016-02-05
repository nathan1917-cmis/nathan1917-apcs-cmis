import java.util.ArrayList;

public class MyPod2
    {
    private String color;
    private int memory;
    private ArrayList<Song> songLibrary = new ArrayList<Song>();
    
    public MyPod2 ()
        {
        color = "black";
        memory = 64;
        songLibrary.add( new Song("In the Aeroplane Over the Sea" ));
        songLibrary.add( new Song("Holland 1945" ));
        songLibrary.add( new Song("Communist Daughter" ));
        }//end myPod
    public MyPod2(String color, int memory, String song1, String song2, String song3)
        {
        this.color = color;
        this.memory = memory;
        songLibrary.add( new Song( song1 ));
        songLibrary.add( new Song( song2 ));
        songLibrary.add( new Song( song3 ));
        }//end method MyPod
    public String toString()
        {
        String output = "Color: " + color + "\nMemory Capacity: " + memory + "\nSongs: " + "\n - " + songLibrary.get(0) + "\n - " + songLibrary.get(1) + "\n - " + songLibrary.get(2);
        return output;
        }//end toString
    public int size()
        {
        return songLibrary.size();
        }//end method size
    }//end class MyPod