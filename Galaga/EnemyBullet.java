import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Bullet
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        while (this.isDead == false)
            {
                super.act();
            }
    }    
    private boolean death = false;
    public void move()
    {
        setLocation(getX(), getY() - speed);
    }

    public void checkBoundaries()
    {
        super.checkBoundaries();
    }

    public boolean isDead()
    {
        return death;
    }//end
    public void check()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }//end
        else
        {
            destroyEnemies();
        }//
    }//end
    //private Actor enemy = getOneIntersectingObject(Player.class);
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

    private int speed = -3;
}
