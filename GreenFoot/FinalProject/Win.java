import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Win extends World
{
    public Win()
    {    
        super(600, 400, 1); 
        showText("You Won", 300,200);
        showText("Yay", 300,225);
        showText("So Cool",300,250);
        showText("Get a life", 300, 275);
        showText("Press space to go blow up something", 300,300);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Castle());
        }
    }
}
