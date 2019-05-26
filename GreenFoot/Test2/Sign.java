import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Sign extends Actor
{
    private GreenfootImage forest = new GreenfootImage("forestSign");
    private GreenfootImage castle = new GreenfootImage("castleSign");
    public void act() 
    {
        set();
    }    
    
    public void set()
    {
        Meg meg = ((MyWorld)getWorld()).getMeg();
        int megX = meg.getX();
        if (megX < 300)
        {
            setImage(forest);
        }
        else if(megX > 300)
        {
            setImage(castle);
        }
    }
}
