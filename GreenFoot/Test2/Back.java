import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Back extends Actor
{
    private int width = getImage().getWidth()/2;
    private int height = getImage().getHeight()/2;
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        if(Greenfoot.mouseClicked(this))
        {
             Greenfoot.setWorld(new MyWorld()); 
        }
    }    
}
