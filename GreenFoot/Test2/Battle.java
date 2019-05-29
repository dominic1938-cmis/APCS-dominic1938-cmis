import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Battle extends World
{
    private Meg meg = new Meg();
    public Battle()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        int chance = (int)(Math.random() *100);
        int side = (int)((Math.random() * 2) + 1);
        int ranXl = (int)((Math.random() * 28) + 8);
        int ranYl = (int)((Math.random() * 239) +219);
        int ranXr = (int)((Math.random() * 591) + 586);
        int ranYr = (int)((Math.random() * 395) +223);
        if (chance > 97)
        {
            if (side == 2)
            {
                summon(ranXl, ranYl);
            }
            else if (side == 1)
            {
                summon(ranXr, ranYr);
            }
        }
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

    public void summon(int x, int y)
    {
        int ranMonster = (int)(Math.random() * 3);
        switch(ranMonster)
        {
            case(0):
            addObject(new Bee(), x,y);
            break;
            case(1):
            addObject(new Squid(), x,y);
            break;
            case(2):
            addObject(new Mouse(), x,y);
            break;
            case(3):
            addObject(new Bat(), x,y);
            break;
        }
    }

    public Meg getMeg()
    {
        return meg;
    }
}
