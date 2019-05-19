import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Yes extends Actor
{
    private Yes yes;
    private GreenfootImage ye = new GreenfootImage("yes.png");

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
             Greenfoot.setWorld(new Castle()); 
        }
    }
}
