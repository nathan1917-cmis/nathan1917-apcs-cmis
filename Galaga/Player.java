import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveLeft();
        moveRight();
        checkFire();
        collision();
    }   

    public void moveLeft()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }//end if
    }//end moveLeft
    public void moveRight()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }//end if
    }//end moveRight
    public void checkFire()
    {
        String key = Greenfoot.getKey();
        if("space".equals(key)) 
        {
            getWorld().addObject(new PlayerBullet), getX(), getY());
        }
    }
    public void death()
        {
         
        }//end
    public void collision()
        {
         Actor enemy = getOneIntersectingObject(Enemy.class);
         Actor spawn = getOneIntersectingObject(Spawner.class);
         if (enemy != null)
            {
             getWorld().removeObject(enemy);
             getWorld().removeObject(this);
            }
         if (spawn != null)
            {
            getWorld().removeObject(spawn);
            getWorld().removeObject(this);
            }
        }//end collision
}
