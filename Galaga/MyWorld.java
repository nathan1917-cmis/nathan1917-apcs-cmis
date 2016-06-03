import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(224, 288, 1); 
        prepare();
        
    }
    //GreenfootSound stair = new GreenfootSound("stair.mp3");
    //GreenfootSound silence = new GreenfootSound("silence.mp3");
    //GameOver gameO = new GameOver();
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,124,271);
        player.setLocation(109,272);
        player.setLocation(112,272);
        Spawner spawner = new Spawner();
        addObject(spawner,22,27);
        Spawner spawner2 = new Spawner();
        addObject(spawner2,213,64);

    }
}
