import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bee extends Actor implements Monsters
{
    private GreenfootImage right1 = new GreenfootImage("rbee1.png");
    private GreenfootImage right2 = new GreenfootImage("rbee2.png");
    private GreenfootImage right3 = new GreenfootImage("rbee3.png");
    private GreenfootImage left1 = new GreenfootImage("lbee1.png");
    private GreenfootImage left2 = new GreenfootImage("lbee2.png");
    private GreenfootImage left3 = new GreenfootImage("lbee3.png");
    private GreenfootImage ratk = new GreenfootImage("rbeeatk.png");
    private GreenfootImage latk = new GreenfootImage("lbeeatk.png");
    private int megX;
    private int megY;
    private int animate = 1;
    private int health = 500;
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int x){
        health -= x;
    }
    
    public void act() 
    {
        move();
        if (isTouching(Projectile.class) || isTouching(Boom.class))
        {
            getWorld().removeObject(this);

        }
    }  

    public void move()
    {   Meg meg = ((Battle)getWorld()).getMeg();
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

        }
        else if (megY > this.getY())
        {
            setLocation(getX(), getY()+1);

        }
    }  
}
