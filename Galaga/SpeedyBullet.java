import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedyBullet extends EnemyBullet
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }    
    private boolean death = false;
    public void move()
        {
        super.move();
        }
    public void checkBoundaries()
    {
      super.checkBoundaries();
    }
    public boolean isDead()
        {
        return super.isDead();
        }//end
    public void check()
    {
        super.check();
    }//end
    //private Actor enemy = getOneIntersectingObject(Player.class);
    public void destroyEnemies()
    {
      super.destroyEnemies();
    }

    private int speed = -5;
}
