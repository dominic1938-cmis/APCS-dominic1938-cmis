import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    private  = new Castle();
    public void act() 
    {
        text();        
    }

    public void text()
    {
        if (isTouching(Meg.class))
        {
            Text text = new Text();
            Yes yes = new Yes();
            getWorld().addObject(text, 300,200);
            getWorld().addObject(yes,300,350);
        }
        else
        {
            getWorld().removeObjects(getWorld().getObjects(Text.class));
            getWorld().removeObjects(getWorld().getObjects(Yes.class));
        }
    }
}