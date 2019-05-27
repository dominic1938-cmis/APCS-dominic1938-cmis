import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    private World castle = new Castle();
    private World battle = new Battle();
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
            if (Greenfoot.isKeyDown("x"))
            {
                Greenfoot.setWorld(castle);
            }
            getWorld().addObject(sign1, 300,200);
            getWorld().showText(message,300,300);
        }
        else if (isTouching(Meg.class) && megX < 300)
        {
            if (Greenfoot.isKeyDown("x"))
            {
                Greenfoot.setWorld(battle);
            }
            getWorld().addObject(sign2, 300,200);
            getWorld().showText(message,300,300);
        }

    }
}