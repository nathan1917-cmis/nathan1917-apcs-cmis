import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor implements Destroyers
{
    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (int i = 0; i < level *5; i++) 
        {
            spawn();
        }
        if (counter >= level * 5)
        {
            getWorld().removeObject(this);
        }//end

    }

    private int turn = -1;
    private int flip = -10;
    private int level = 1;
    private int counter = 0;
    public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }//end getRandomNumber
    public void spawn()
    {
        setLocation(getX(), getY() + turn);
        int randy = getRandomNumber(1, 10);
        if (isAtEdge() || getY() >= 75)
        {
            Enemy enemy = new Enemy();
            getWorld().addObject(enemy, getX(), getY());
            turn *= -1;
            flip *= -1;
            counter++;
        }//end
        if (getY() == 37)
        {
            Enemy enemy = new Enemy();
            getWorld().addObject(enemy, getX(), getY());
            if (randy <= 5)
            {
                DoubleFire enemy = new DoubleFire();
                getWorld().addObject(enemy, getX(), getY());
            }
        }

    }

    public void destroyEnemies()
    {
        Actor enemy = getOneIntersectingObject(Player.class);
        if(enemy != null) {

            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
        if (this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
