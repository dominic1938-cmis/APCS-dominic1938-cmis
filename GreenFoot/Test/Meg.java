import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Meg extends Actor
{
    //private GreenfootImage name = new GreenfootImage("name.png");
    private GreenfootImage left = new GreenfootImage("lmeg.png");
    public void act() 
    {
        move();
    }    

    public Meg()
    {
        GreenfootImage image = getImage();
        int newHeight = image.getHeight()/3+20;
        int newWidth = image.getWidth()/3+20;
        image.scale(newWidth, newHeight);
    }

    public void move()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        else if (Greenfoot.isKeyDown("a"))
        {   
            move(-1);
            setImage(left);
        }
        else if (Greenfoot.isKeyDown("w"))
        {   
            setLocation(getX(), getY()-1);
        }
        else if (Greenfoot.isKeyDown("s"))
        {   
            setLocation(getX(), getY()+1);
        }
    }
}
