import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Battle extends World
{
    public Battle()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare()
    {
        Face face = new Face();
        Health health = new Health();
        Mana mana = new Mana();
        addObject(face,42,42);
        addObject(health,109,39);
        addObject(mana,109,39);
        Meg meg = new Meg();
        addObject(meg,562,290);
        Barrier barrier = new Barrier();
        addObject(barrier,588,169); barrier = new Barrier();
        addObject(barrier,445,172); barrier = new Barrier();
        addObject(barrier,525,171); barrier = new Barrier();
        addObject(barrier,367,170); barrier = new Barrier();
        addObject(barrier,290,174); barrier = new Barrier();
        addObject(barrier,232,151); barrier = new Barrier();
        addObject(barrier,162,154); barrier = new Barrier();
        addObject(barrier,46,135); barrier = new Barrier();
        addObject(barrier,105,127); barrier = new Barrier();
    }
}
