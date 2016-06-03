import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bullet extends Actor implements Destroyers
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        checkBoundaries();
    }
    
    public void move()
        {
         setLocation(getX(), getY() + speed);
        }
    public void checkBoundaries()
    {
        if(getX() > getWorld().getWidth() - 1) 
            getWorld().removeObject(this);
        else if(getX() < 1) 
            getWorld().removeObject(this);
        else if(getY() > getWorld().getHeight() - 1) 
            getWorld().removeObject(this);
        else if(getY() < 1) 
            getWorld().removeObject(this);
        else
            destroyEnemies();
    }
    public void destroyEnemies()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null) {

            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
    }
    
    private int speed = -3
    ;
}
