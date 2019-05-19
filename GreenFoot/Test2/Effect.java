import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Effect extends Actor
{
    
    public Effect(int x, int y)
    {
        GreenfootImage image = getImage();
        image.scale(x,y);
    }  
}
