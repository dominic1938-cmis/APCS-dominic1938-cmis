import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Path extends Actor
{
    private World castle = new Castle();
    private World battle = new Battle();
    private String message = "Press X to go";
    private String letter;
    private String hardness;

    public void act() 
    {
        text();
    }

    public void text()
    {
        Meg meg = ((MyWorld)getWorld()).getMeg();
        int megX = meg.getX();
        Sign sign1 = new Sign(0.0);
        Sign sign2 = new Sign(0);
        if (isTouching(Meg.class) && megX > 300)
        {
            transport();
            getWorld().addObject(sign1, 300,200);
            getWorld().showText(message,300,300);
        }
        else if (isTouching(Meg.class) && megX < 300)
        {
            transport();
            getWorld().addObject(sign2, 300,200);
            letter = "h";
            hardness = "hard";
            getWorld().showText("Press " + letter + " for " + hardness,300,300);
            letter = "n";
            hardness = "normal";

            getWorld().showText("Press " + letter + " for " + hardness,300,325);
            letter = "e";
            hardness = "easy";

            getWorld().showText("Press " + letter + " for " + hardness,300,350);
        }
    }

    public void transport()
    {
        Battle battle = new Battle();
        Meg meg = ((MyWorld)getWorld()).getMeg();
        int megX = meg.getX();
        if (megX > 300)
        {
            if (Greenfoot.isKeyDown("x"))
            {
                Greenfoot.setWorld(castle);
            }
        }
        else if (megX < 300)
        {
            if (Greenfoot.isKeyDown("h"))
            {
                battle.setDifficulty(8);
                battle.setCondition(10);
                battle.setAmount(5);
                Greenfoot.setWorld(battle);
            }
            if (Greenfoot.isKeyDown("e"))
            {
                Greenfoot.setWorld(battle);
            }
            if (Greenfoot.isKeyDown("n"))
            {
                battle.setDifficulty(4);
                battle.setCondition(5);
                battle.setAmount(3);
                Greenfoot.setWorld(battle);
            }
        }
    }
}