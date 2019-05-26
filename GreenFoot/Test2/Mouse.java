import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Monsters
{
    private GreenfootImage rightr = new GreenfootImage("rmouser.png");
    private GreenfootImage rightl = new GreenfootImage("rmousel.png");
    private GreenfootImage leftl = new GreenfootImage("lmousel.png");
    private GreenfootImage leftr = new GreenfootImage("lmouser.png");
    private GreenfootImage ratk = new GreenfootImage("rmouseatk");
    private GreenfootImage latk = new GreenfootImage("lmouseatk");
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
                    setImage(rightr);
                }
                if (animate == 0)
                {
                    setImage(rightl);
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
                    setImage(leftr);
                }
                if (animate == 0)
                {
                    setImage(leftl);
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
                    setImage(rightr);
                }
                if (animate == 0)
                {
                    setImage(rightl);
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
                    setImage(leftr);
                }
                if (animate == 0)
                {
                    setImage(leftl);
                    animate = 40;
                }
            }
        }
    }   
}