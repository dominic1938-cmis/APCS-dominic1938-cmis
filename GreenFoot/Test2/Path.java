import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    private World castle = new Castle();
    private World battle = new Battle();
    private boolean which;

    public Path(String x)
    {
        which = true;
    }

    public Path(int x)
    {
        which = false;
    }

    public void act() 
    {
        text();
    }

    public void text()
    {
        if (isTouching(Meg.class) && which)
        {
            Greenfoot.setWorld(castle);
        }
        else if (isTouching(Meg.class) && !which)
        {
            Greenfoot.setWorld(battle);
        }
    }
}