import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBullet extends Bullet implements Destroyers
{
    /**
     * Act - do whatever the PlayerBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }
    
    public void move()
        {
         super.move();
        }
    public void checkBoundaries()
    {
        super.checkBoundaries();
    }
    public void destroyEnemies()
    {
        super.destroyEnemies();
    }
    
    private int speed = -3
    ;
}
