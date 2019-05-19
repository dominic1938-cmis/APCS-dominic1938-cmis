
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    public void act() 
    {
        Meg position = (Meg)getWorld().getObjects(Meg.class).get(0);
        if (position.getX() >= 200){
            text();
        }
        else
        {
            text2();
        }    
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

    public void text2()
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