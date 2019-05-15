import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Berd berd = new Berd();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void prepare()
    {
        Food food = new Food();
        addObject(berd, 300, 200);
        addObject(food, 25, 25);
    }
    
    public Berd getBerd()
    {
        return berd;
    }
}
