import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bat extends Monsters
{
    private GreenfootImage rightu = new GreenfootImage("rbatu.png");
    private GreenfootImage leftu = new GreenfootImage("lbatu.png");
    private GreenfootImage leftd = new GreenfootImage("lbatd.png");
    private GreenfootImage rightd = new GreenfootImage("rbatd.png");
    private GreenfootImage ratk = new GreenfootImage("rbatatk");
    private GreenfootImage latk = new GreenfootImage("lbatatk");
    private int megX;
    private int megY;
    private int animate = 1;
    public void act() 
    {
        move();
    }    

    public void move()
    {
        Meg meg = ((MyWorld)getWorld()).getMeg();
        megX = meg.getX();
        megY = meg.getY();
        if (megX > this.getX())
        {
            move(1);
            if (this.isTouching(Meg.class))
            {
                setImage(ratk);
            }
            else if (animate > 0)
            {
                animate--;
                if (animate == 20)
                {
                    setImage(rightu);
                }
                if (animate == 0)
                {
                    setImage(rightd);
                    animate = 40;
                }
            }
        }
        else if (megX < this.getX())
        {
            move(-1);
            if (this.isTouching(Meg.class))
            {
                setImage(latk);
            }
            else if (animate > 0)
            {
                animate--;
                if (animate == 20)
                {
                    setImage(leftu);
                }
                if (animate == 0)
                {
                    setImage(leftd);
                    animate = 40;
                }
            }
        }

        if (megY < this.getY())
        {
            setLocation(getX(), getY()-1);
            if (animate > 0)
            {
                animate--;
                if (animate == 20)
                {
                    setImage(rightu);
                }
                if (animate == 0)
                {
                    setImage(rightd);
                    animate = 40;
                }
            }
        }
        else if (megY > this.getY())
        {
            setLocation(getX(), getY()+1);
            if (animate > 0)
            {
                animate--;
                if (animate == 20)
                {
                    setImage(leftu);
                }
                if (animate == 0)
                {
                    setImage(leftd);
                    animate = 40;
                }
            }
        }
    }
}