import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boss extends Actor
{
    private GreenfootImage b1 = new GreenfootImage("boss1.png");
    private GreenfootImage b2 = new GreenfootImage("boss2.png");
    private GreenfootImage b3 = new GreenfootImage("boss3.png");
    private Health health;
    private int lifeCount = 20000;
    private int animate = 90;
    public void act() 
    {
        animate();
        if (isTouching(Projectile.class) || isTouching(Boom.class))
        {
            lifeCount -= 50;
            health.setLife(lifeCount, true);
        }
        if(lifeCount <= 0)
        {
            for (int i = 0; i <100;i++)
            {
                int x = Greenfoot.getRandomNumber(150);
                int y = Greenfoot.getRandomNumber(150);
                Boom boom = new Boom();
                getWorld().addObject(boom, getX() + x, getY() + y);
            }
            Greenfoot.stop();
            getWorld().showText("You Win!", 300,200);
        }
    }    

    public Boss()
    {
        health = new Health(lifeCount ,true);
    }

    public int getHealth()
    {
        return lifeCount;
    }

    public void addedToWorld(World world){
        world.addObject(health,340, 26);
    }

    public void animate()
    {
        if (animate > 0)
        {
            animate--;
            if (animate == 60)
            {
                setImage(b1);
            }
            if (animate == 30)
            {
                setImage(b2);
            }
            if (animate == 0)
            {
                setImage(b3);
                animate = 90;
            }
        }
    }
}