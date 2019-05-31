import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Sign extends Actor
{
    private GreenfootImage forest = new GreenfootImage("forestSign.png");
    private GreenfootImage castle = new GreenfootImage("castleSign.png");
    public void act() 
    {
    }    

    public Sign(int x)
    {
        setImage(forest);
    }

    public Sign(double x)
    {
        setImage(castle);
    }
}
