import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        Meg meg = new Meg();
        addObject(meg, 200, 200);
    }
}
