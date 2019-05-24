import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Castle extends World
{
    private String txt = "Click To Boost!";
    private int timer = 900;
    private int width = 29;
    private int length = 29;
    private int clicks;
    private int points = 0;
    private int spam = 100;
    private GreenfootImage explode = new GreenfootImage("castle gone.png");
    public Castle()
    {
        super(600, 400, 1);
        Effect effect = new Effect(width,length);
        addObject(effect,107,326);
        showText(txt,300,200);
        Meg meg = new Meg();
        Face face = new Face();
        addObject(face,42,42);
    }

    public void act()
    {
        if (timer > 0)
        {
            timer--;
            Effect effect = new Effect(width,length);
            if (Greenfoot.mouseClicked(null))
            {
                clicks++;
                showText("",300,200);
                this.removeObjects(getObjects(Effect.class));
                width+=2;
                length+=2;
                addObject(effect,107,326);
            }
        }
        else if (timer == 0)
        {
            if (width <= 0 && length <=0)
            {
                Back back = new Back();
                if (spam > 0){
                    spam--;
                    points = (int)(Math.random() * 50) + clicks;
                }
                setBackground(explode);
                String score = (points +  " POINTS!");
                showText(score,300,200);
                addObject(back,52,42);
            }
            else{
                Effect effect = new Effect(width,length);
                this.removeObjects(getObjects(Effect.class));
                width-=10;
                length-=10;
                addObject(effect,107,326);
            }
        }
    }
}
