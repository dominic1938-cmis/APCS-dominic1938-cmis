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
    private int swap = 150;
    private int manaLevel = 1;
    private String instaKill = "0";
    private GreenfootImage explode = new GreenfootImage("castle gone.png");
    private GreenfootImage market = new GreenfootImage("loading.png");
    public Castle()
    {
        super(600, 400, 1);
        Effect effect = new Effect(width,length);
        addObject(effect,107,326);
        showText(txt,300,200);
    }

    public void act()
    {
        Back back = new Back();
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
                if (spam > 0){
                    spam--;
                    points = (int)(Math.random() * 50) + clicks;
                    setBackground(explode);
                    String score = (points +  " POINTS!");
                    showText(score,300,200);
                }
                else{
                    addObject(back,59,41);
                }
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

    public int getPoints()
    {
        return points;
    }
}
