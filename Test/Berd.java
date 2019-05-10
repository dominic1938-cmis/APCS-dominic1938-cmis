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
        if (Greenfoot.isKeyDown("w"))y--;
        if (Greenfoot.isKeyDown("a"))x--;
        if (Greenfoot.isKeyDown("s"))y++;
        if (Greenfoot.isKeyDown("d"))x++;
        setLocation(x, y);
    }
}