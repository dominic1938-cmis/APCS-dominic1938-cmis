import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Back extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
             Greenfoot.setWorld(new MyWorld()); 
        }
    }    
}
