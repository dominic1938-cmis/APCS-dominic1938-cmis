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
    private GreenfootImage lsh = new GreenfootImage("lshoot.png");
    private GreenfootImage rsh = new GreenfootImage("rshoot.png");
    private Health life;
    private Mana mana;
    private int manaCount=100;
    private int lifeCount=100;
    private int timer = 1;
    private int recharge = 1;
    private int healing = 15;
    public void act() 
    {
        move();
        if (Greenfoot.mouseClicked(null) && manaCount == 100)
        {
            fire();

            MouseInfo mi = Greenfoot.getMouseInfo();
            int x = mi.getX(); 
            if (x > getX())
            {
                setImage(rsh);
            }
            else if (x < getX())
            {
                setImage(lsh);
            }
        }

        effects();
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

    public void effects()
    {
        if (isTouching(Monsters.class))
        {
            setHealth(1);
        }
        else if (!isTouching(Monsters.class) && lifeCount < 100)
        {
            if (healing > 0)
            {
                healing--;
                if (healing == 0)
                {
                    lifeCount++;
                    life.setLife(lifeCount);
                    healing = 15;
                }
            }
        }
        if (lifeCount <= 0)
        {
            Greenfoot.stop();
            getWorld().showText("You Died", 300,200);
        }

        if (Greenfoot.mouseClicked(null) && manaCount == 100)
        {
            setMana(100);
        }

        if (recharge > 0 && manaCount < 100)
        {
            recharge--;
            if (recharge == 0)
            {
                manaCount++;
                mana.setMana(manaCount);
                recharge = 1;
            }
        }
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

    public int getMana()
    {
        return manaCount;
    }

    public void setHealth(int x)
    {
        lifeCount -= x;
        life.setLife(lifeCount);
    }

    public void setMana(int x)
    {
        manaCount -= x;
        mana.setMana(manaCount);
    }

    public void fire(){
        Projectile projectile = new Projectile(); 
        MouseInfo mi = Greenfoot.getMouseInfo();
        getWorld().addObject(projectile, getX(), getY() + 20);
        projectile.turnTowards(mi.getX(), mi.getY());
        projectile.move(60); 
    }
}

