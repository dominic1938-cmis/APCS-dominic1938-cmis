import greenfoot.*;
public class Meg extends Actor
{
    private GreenfootImage rightr = new GreenfootImage("rsider.png");
    private GreenfootImage rightl = new GreenfootImage("lsider.png");
    private GreenfootImage leftl = new GreenfootImage("lsidel.png");
    private GreenfootImage leftr = new GreenfootImage("lsider.png");
    private GreenfootImage downl = new GreenfootImage("frntl.png");
    private GreenfootImage downr = new GreenfootImage("frntr.png");
    private GreenfootImage upl = new GreenfootImage("bckl.png");
    private GreenfootImage upr = new GreenfootImage("bckr.png");
    private int timer = 1;
    public void act() 
    {
        move();
    }    

    public void move()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(1);
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
}
