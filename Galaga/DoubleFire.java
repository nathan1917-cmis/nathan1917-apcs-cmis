import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleFire extends Actor implements Destroyers
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     shiftLeft();
     shiftRight();
     shouldShoot();
     bottomCheck();
    }
    boolean left = true;
    private int counter = 0;
    private int randTimer = getRandomNumber(10, 50);
    public void shiftLeft()
    {
        
        if (left)
        {
            move(1);

        }
        if (getX() == getWorld().getWidth() - 5)
        {
            left = false;
            this.setLocation(getX(), getY() + 25);
        }//end
    }//end shiftLeft
    public void shiftRight()
        {
        if (!left)
            {
            move(-1);
            }//end if
        if (getX() == ( getWorld().getWidth() - getWorld().getWidth() ) + 5 )
            {
            left = true;
            this.setLocation(getX(),getY() + 25);
            }
        }//end shiftRight
     public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }//end getRandomNumber
    public void shouldShoot()
        {
        int offset = getRandomNumber(10, 270);
        Actor enemy = getOneObjectAtOffset(5, offset, Player.class);
        
        if (enemy != null)
            {
             getWorld().addObject(new EnemyBullet(), getX(), getY());
             getWorld().addObject(new SpeedyBullet(), getX(), getY());
            }
        /*else if (enemy!= null && counter < randTimer)
            {
            counter++;
            }
            
        
        
         */}
    public void bottomCheck()
        {
         if (getY() >= getWorld().getHeight() - 1 )
            {
            getWorld().removeObject(this);
            }
            
        }//end
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
