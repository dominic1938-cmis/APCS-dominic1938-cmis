import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BossProjectile extends Actor
{
    public void act() 
    {
        int random = (int)(Math.random() * 180);
        if (atWorldEdge() || isTouching(Meg.class)){
            getWorld().removeObject(this); 
        }
        turn(random);
        move(10);
    }

    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }

}