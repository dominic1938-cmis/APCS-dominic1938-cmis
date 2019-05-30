import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    private World castle = new Castle();
    private World loading = new Battle();
    private String message = "Press X to go";

    public void act() 
    {
        text();
    }

    public void text()
    {
        Meg meg = ((MyWorld)getWorld()).getMeg();
        int megX = meg.getX();
        Sign sign1 = new Sign(0.0);
        Sign sign2 = new Sign(0);
        if (isTouching(Meg.class) && megX > 300)
        {
            transport();
            getWorld().addObject(sign1, 300,200);
            getWorld().showText(message,300,300);
        }
        else if (isTouching(Meg.class) && megX < 300)
        {
            transport();
            getWorld().addObject(sign2, 300,200);
            getWorld().showText(message,300,300);
        }
    }

    public void transport()
    {
        Meg meg = ((MyWorld)getWorld()).getMeg();
        int megX = meg.getX();
        if (megX > 300)
        {
            if (Greenfoot.isKeyDown("x"))
            {
                Greenfoot.setWorld(castle);
            }
        }
        else if (megX < 300)
        {
            if (Greenfoot.isKeyDown("x"))
            {
                Greenfoot.setWorld(loading);
            }
        }
    }
}