import greenfoot.*;  
public class Boom extends Actor
{
    private int lifeTime; 

    public Boom(){
        lifeTime = 10; 
    }

    public void act() 
    {
        lifeTime--; 
        if (lifeTime == 0)
        {
            getWorld().removeObject(this); 
        }    
    }
}