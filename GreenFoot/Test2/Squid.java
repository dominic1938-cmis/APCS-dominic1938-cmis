import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Squid extends Actor implements Monsters
{
    private GreenfootImage right1 = new GreenfootImage("rsquid1.png");
    private GreenfootImage right2 = new GreenfootImage("rsquid2.png");
    private GreenfootImage right3 = new GreenfootImage("rsquid3.png");
    private GreenfootImage left1 = new GreenfootImage("lsquid1.png");
    private GreenfootImage left2 = new GreenfootImage("lsquid2.png");
    private GreenfootImage left3 = new GreenfootImage("lsquid3.png");
    private GreenfootImage ratk = new GreenfootImage("rsquidatk.png");
    private GreenfootImage latk = new GreenfootImage("lsquidatk.png");
    private int megX;
    private int megY;
    private int animate = 1;
    public void act() 
    {
        move();
        if (isTouching(Projectile.class) || isTouching(Boom.class))
        {
            getWorld().removeObject(this);
        }
    }    

    public void move()
    {
        Meg meg = ((Battle)getWorld()).getMeg();
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
                if (animate == 10)
                {
                    setImage(right1);
                }
                if (animate == 5)
                {
                    setImage(right2);
                }
                if (animate == 0)
                {
                    setImage(right3);
                    animate = 20;
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
                if (animate == 10)
                {
                    setImage(left1);
                }
                if (animate == 5)
                {
                    setImage(left2);
                }
                if (animate == 0)
                {
                    setImage(left3);
                    animate = 20;
                }
            }
        }
        if (megY < this.getY())
        {
            setLocation(getX(), getY()-1);
            if (animate > 0)
            {
                animate--;
                if (animate == 10)
                {
                    setImage(left1);
                }
                if (animate == 5)
                {
                    setImage(left2);
                }
                if (animate == 0)
                {
                    setImage(left3);
                    animate = 20;
                }
            }
        }
        else if (megY > this.getY())
        {
            setLocation(getX(), getY()+1);
            if (animate > 0)
            {
                animate--;
                if (animate == 10)
                {
                    setImage(right1);
                }
                if (animate == 5)
                {
                    setImage(right2);
                }
                if (animate == 0)
                {
                    setImage(right3);
                    animate = 20;
                }
            }
        }
    }  
}
