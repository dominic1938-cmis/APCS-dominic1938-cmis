import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Berd extends Actor
{
    public void act() 
    {
        move();
    }    

    public void move()
    {
        int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("w"))
        {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            turn(3);
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
        move(3);
    }
}