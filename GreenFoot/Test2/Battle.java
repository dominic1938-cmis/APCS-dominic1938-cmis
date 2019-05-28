import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Battle extends World
{
    private Meg meg = new Meg();
    public Battle()
    {    
        super(600, 400, 1); 
        prepare();
        summon();
    }

    public void prepare()
    {
        Face face = new Face();
        addObject(meg,562,290);
        addObject(face,42,42);
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

    public void summon()
    {
        Monsters monster = new Monsters();
        Monsters[] all = monster.getList();
        if (Greenfoot.isKeyDown("p"))
        {
            Monsters a = (Monsters)all[(int)(Math.random() * all.length)];
            addObject(a,300,200);
        }
    }

    public Meg getMeg()
    {
        return meg;
    }
}
