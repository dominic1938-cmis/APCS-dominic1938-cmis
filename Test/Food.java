import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Food extends Actor
{
    public void act() 
    {
        int x = getX();
        int y = getY();
        int bx = ((MyWorld)getWorld()).getBerd().getX();
        int by = ((MyWorld)getWorld()).getBerd().getY();
        int random = (int)Math.random();
        if (bx > x)
        {
            x++;
        }
        else if (bx < x)
        {
            x--;
        }
        
        if (by > y)
        {
            y++;
        }
        else if (by < y)
        {
            y--;
        }
        setLocation(x,y);
    }    
}
