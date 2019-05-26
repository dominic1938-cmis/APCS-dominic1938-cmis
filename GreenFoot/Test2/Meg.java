import greenfoot.*;
public class Meg extends Actor
{
    private GreenfootImage rightr = new GreenfootImage("rsider.png");
    private GreenfootImage rightl = new GreenfootImage("rsidel.png");
    private GreenfootImage leftl = new GreenfootImage("lsidel.png");
    private GreenfootImage leftr = new GreenfootImage("lsider.png");
    private GreenfootImage downl = new GreenfootImage("frntl.png");
    private GreenfootImage downr = new GreenfootImage("frntr.png");
    private GreenfootImage upl = new GreenfootImage("bckl.png");
    private GreenfootImage upr = new GreenfootImage("bckr.png");
    private Health life;
    private Mana mana;
    private int manaCount=100;
    private int lifeCount=100;
    private int timer = 1;
    public void act() 
    {
        move();
    } 

    public Meg()
    {
        life = new Health(lifeCount);
        mana = new Mana(manaCount);
    }

    public void addedToWorld(World world){
        world.addObject(life,116, 29);
        world.addObject(mana,116,59);
    }

    public void move()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(1);
            if (isTouching(Barrier.class))
            {
                move(-2);
            }
            if (timer > 0)
            {
                timer--;
                if (timer == 10)
                {
                    setImage(rightl);
                }
                if (timer == 0)
                {
                    setImage(rightr);
                    timer = 20;
                }
            }
        }
        else if (Greenfoot.isKeyDown("a"))
        {   
            move(-1);
            if (isTouching(Barrier.class))
            {
                move(2);
            }
            if (timer > 0)
            {
                timer--;
                if (timer == 10)
                {
                    setImage(leftl);
                }
                if (timer == 0)
                {
                    setImage(leftr);
                    timer = 20;
                }
            }
        }
        else if (Greenfoot.isKeyDown("w"))
        {   
            setLocation(getX(), getY()-1);
            if (isTouching(Barrier.class))
            {
                setLocation(getX(), getY()+2);
            }
            if (timer > 0)
            {
                timer--;
                if (timer == 10)
                {
                    setImage(upl);
                }
                if (timer == 0)
                {
                    setImage(upr);
                    timer = 20;
                }
            }
        }
        else if (Greenfoot.isKeyDown("s"))
        {   
            setLocation(getX(), getY()+1);
            if (isTouching(Barrier.class))
            {
                setLocation(getX(), getY()-2);
            }
            if (timer > 0)
            {
                timer--;
                if (timer == 10)
                {
                    setImage(downl);
                }
                if (timer == 0)
                {
                    setImage(downr);
                    timer = 20;
                }
            }
        }

    }

    public int getHealth()
    {
        return lifeCount;
    }

    public void setHealth(int x)
    {
        lifeCount -= x;
        life.setLife(lifeCount);
    }
}
