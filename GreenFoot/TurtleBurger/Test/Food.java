import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Food extends Actor
{
    public void act() 
    {
        int x = getX();
        int y = getY();
        int bx = ((MyWorld)getWorld()).getBerd().getX();
        int by = ((MyWorld)getWorld()).getBerd().getY();
        turnTowards(bx, by);
        move(2);
    }    
}
