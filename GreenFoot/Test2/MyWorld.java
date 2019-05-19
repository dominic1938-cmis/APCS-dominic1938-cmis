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
        Path path = new Path();
        Barrier barrier = new Barrier();
        addObject(meg, 477, 343);
        addObject(path, 380 ,37); path = new Path();
        addObject(path, 37, 271);
        
        addObject(barrier,3,202); barrier = new Barrier();
        addObject(barrier,35,393); barrier = new Barrier();
        addObject(barrier,105,391); barrier = new Barrier();
        addObject(barrier,146,360); barrier = new Barrier();
        addObject(barrier,202,313); barrier = new Barrier();
        addObject(barrier,246,337); barrier = new Barrier();
        addObject(barrier,292,398); barrier = new Barrier();
        addObject(barrier,466,205); barrier = new Barrier();
        addObject(barrier,403,151); barrier = new Barrier();
        addObject(barrier,597,134); barrier = new Barrier();
        addObject(barrier,316,66); barrier = new Barrier();
        addObject(barrier,286,68); barrier = new Barrier();
        addObject(barrier,250,19); barrier = new Barrier();
        addObject(barrier,198,33); barrier = new Barrier();
        addObject(barrier,345,137);
    }
}
