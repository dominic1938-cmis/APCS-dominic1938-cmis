import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Projectile extends Actor
{
    private GreenfootImage one = new GreenfootImage("projectile1.png");
    private GreenfootImage two = new GreenfootImage("projectile2.png");
    private GreenfootImage three = new GreenfootImage("projectile3.png");
    private GreenfootImage four = new GreenfootImage("projectile4.png");
    Meg meg = new Meg();
    int change = 20;
    public void act() 
    {
        move(10); 
        if (meg.getMana() == 100 && (isTouching(Monsters.class) || atWorldEdge())){
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY()); 
            getWorld().removeObject(this); 
        }
        move();
    }

    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }

    public void move()
    {
        if (change > 0)
        {
            change--;
            if (change == 15)
            {
                setImage(one);
            }
            else if (change == 10)
            {
                setImage(two);
            }
            else if (change == 5)
            {
                setImage(three);
            }
            else if (change == 0)
            {
                setImage(four);
                change = 15;
            }
        }

    }
}